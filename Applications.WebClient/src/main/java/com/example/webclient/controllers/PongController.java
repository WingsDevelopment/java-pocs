package com.example.webclient.controllers;

import com.example.webclient.models.PongVM;
import entities.Pong;
import interfaces.IPongService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/po")
public class PongController {
    private IPongService pongService;

    public PongController(IPongService pongService) {
        this.pongService = pongService;
    }

    @GetMapping(value = "/pongs")
    public String pongs(Model model){
        var pongs = pongService.GetAll();

        model.addAttribute("pongs", pongs);
        return "pongs/pongs";
    }

    @GetMapping
    @RequestMapping("{id}")
    public String getById(Model model, @PathVariable Long id){
        var pong = pongService.GetById(id);
        model.addAttribute("pong", pong);
        return "pongs/details";
    }

    @GetMapping
    @RequestMapping("pong/{id}")
    public String pong(Model model, @PathVariable Long id){
        var ping = pongService.Pong(id);
        model.addAttribute("ping", ping);
        return "ping";
    }

    @GetMapping("createPong")
    public String create(Model model){
        model.addAttribute("pong", new PongVM());

        return "pongs/createPong";
    }

    @PostMapping("createPong")
    public String createPong(@ModelAttribute(value="pong") PongVM pong,BindingResult result) {
        if (result.hasErrors()) {
            return "pongs/createPong";
        }

        var pongDTO = pongService.CreatePong(new Pong(pong.getId()));
        return "redirect:/po/" + pongDTO.getId();
    }

    @PutMapping(value = "update/{id}")
    public String update(@PathVariable Long id, @RequestBody Pong pong,BindingResult result) {
        if (result.hasErrors()) {
            return "pongs/createPong";
        }

        var pongDTO = pongService.UpdatePong(pong);

        return "redirect:/po/" + pongDTO.getId();
    }

    @GetMapping(value = "delete/{id}")
    public String delete(@PathVariable Long id) {
        pongService.Delete(id);

        return "redirect:/po/pongs";
    }
}
