package com.example.webapi.controllers;

import applicationServices.PongService;
import entities.Ping;
import entities.Pong;
import interfaces.IPongService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/po")
public class PongController {
    private IPongService pongService;

    public PongController(IPongService pongService) {
        this.pongService = pongService;
    }

    @GetMapping
    @RequestMapping("getList")
    public Iterable<Pong> list() {
        return pongService.GetAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Pong getById(@PathVariable Long id) {
        return pongService.GetById(id);
    }

    @GetMapping
    @RequestMapping("pong/{id}")
    public Ping pong(@PathVariable Long id) {
        return pongService.Pong(id);
    }

    @PostMapping
    public Pong create(@RequestBody final Pong pong){
        return pongService.CreatePong(pong);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        pongService.Delete(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Pong update(@PathVariable Long id, @RequestBody Pong pong) {
        return pongService.UpdatePong(pong);
    }
}
