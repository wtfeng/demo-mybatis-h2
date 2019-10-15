package com.example.demo;

import com.example.demo.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    @Autowired
    private CityMapper cityMapper;

    public void get() {
        System.out.println(cityMapper.findByState("Texas"));
    }


}
