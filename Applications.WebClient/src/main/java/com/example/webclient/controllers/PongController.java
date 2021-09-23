package com.example.webclient.controllers;

import com.example.webclient.models.PongVM;
import entities.Ping;
import entities.Pong;
import interfaces.IPongService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;

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
        return "pongs";
    }

    @GetMapping
    @RequestMapping("{id}")
    public String getById(Model model, @PathVariable Long id){
        var pong = pongService.GetById(id);
        model.addAttribute("pong", pong);
        return "details";
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

//    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
//    public void delete(@PathVariable Long id) {
//        pongService.Delete(id);
//    }
//
//    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
//    public Pong update(@PathVariable Long id, @RequestBody Pong pong) {
//        return pongService.UpdatePong(pong);
//    }
}
