package com.jiyeon.project.controller;

import com.jiyeon.project.domain.Actor;
import com.jiyeon.project.service.ActorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/actor")
@AllArgsConstructor
public class ActorController {

    private final ActorService actorService;

    @PostMapping("/save")
    public Boolean save(Actor actor){
       return actorService.save(actor);
    }

    @GetMapping("/{id}")
    public Actor findById(@PathVariable String id){
        return actorService.findById(id);
    }
}