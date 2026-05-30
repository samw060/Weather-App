package com.sam.weather.weatherapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CityTests {

    City city;

    @BeforeEach
    void SetUp(){
        city = new City(20, "moderate rain");
    }

    @Test
    void testCityTemperature(){
        assertEquals(20, city.temperature);
    }

    @Test
    void testCityString(){
        assertEquals("moderate rain", city.condition);
    }
}
