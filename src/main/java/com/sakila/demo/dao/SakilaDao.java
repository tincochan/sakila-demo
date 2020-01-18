package com.sakila.demo.dao;

import com.sakila.demo.po.Actor;
import com.sakila.demo.po.ActorFilms;
import com.sakila.demo.po.Revenues;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

@Mapper
public interface SakilaDao {
    //查询某演员所出演的电影数
    List<Actor> queryFilmNumByActor(String firstName, String lastName);
    //查询某演员所出演的相关电影
    List<ActorFilms> queryFilmByActor(String firstName, String lastName);
    //根据日期查询租赁点的收入
    List<Revenues> queryRevenuesByDates(Date beginDate, Date endDate);
}
