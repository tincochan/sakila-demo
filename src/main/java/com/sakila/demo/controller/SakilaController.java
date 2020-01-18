package com.sakila.demo.controller;

import com.sakila.demo.po.Actor;
import com.sakila.demo.po.ActorFilms;
import com.sakila.demo.service.SakilaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@Slf4j
@RequestMapping("/sakila")
public class SakilaController {
    @Autowired
    private SakilaService sakilaService;

    @PostMapping("/queryFilmNumByActor")
    public List<Actor> queryFilmNumByActor (@RequestBody Actor dto){
        return this.sakilaService.queryFilmNumByActor( dto.getFirstName(), dto.getLastName());
    }

    @PostMapping("/queryFilmByActor")
    public List<ActorFilms> queryFilmByActor (@RequestBody ActorFilms dto){
        return this.sakilaService.queryFilmByActor( dto.getFirstName(), dto.getLastName());
    }
}
