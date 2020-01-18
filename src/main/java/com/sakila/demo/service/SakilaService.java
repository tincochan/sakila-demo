package com.sakila.demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sakila.demo.dao.SakilaDao;
import com.sakila.demo.po.Actor;
import com.sakila.demo.po.ActorFilms;
import com.sakila.demo.po.FilmActor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SakilaService {
    @Autowired
    private SakilaDao sakilaDao;

    public List<Actor> queryFilmNumByActor(String firstName, String lastName){
        return this.sakilaDao.queryFilmNumByActor( firstName, lastName );
    }

    public List<ActorFilms> queryFilmByActor(String firstName, String lastName){
        return this.sakilaDao.queryFilmByActor( firstName, lastName);
    }



}
