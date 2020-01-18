package com.sakila.demo.dao;

import com.sakila.demo.po.Actor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SakilaDao {
    //查询某演员所出演的电影数
    List<Actor> queryFilmNumByActor(String firstName, String lastName);
}
