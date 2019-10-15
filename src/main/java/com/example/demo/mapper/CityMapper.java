package com.example.demo.mapper;

import com.example.demo.model.City;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CityMapper {

    @Select("SELECT * FROM CITY WHERE state = #{state}")
    City findByState(@Param("state") String state);

    @Insert("insert into city (name, state) values (#{city.name},#{city.state})")
    void insert(@Param("city") City city);

    List<City> findAllCities();
}