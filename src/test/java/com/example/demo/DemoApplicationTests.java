package com.example.demo;

import com.example.demo.mapper.CityMapper;
import com.example.demo.model.City;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    CityService cityService;

    @Autowired
    CityMapper cityMapper;

    @Test
    public void shoud_return_city_name() {
        assertEquals("A", cityMapper.findByState("Texas").getName());
    }


    @Test
    public void shoud_insert_new_city() {
        City city = new City("B", "LA");
        cityMapper.insert(city);
        assertEquals("B", cityMapper.findByState("LA").getName());
    }

    @Test
    public void shoud_get_a_list_of_city() {
        assertTrue(cityMapper.findAllCities().size() > 0);
    }
}
