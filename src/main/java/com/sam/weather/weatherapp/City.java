package com.sam.weather.weatherapp;

/**
 * Represents the weather data for a city.
 * Holds parsed data to update the UI.
 */
public class City {
    /** The current temperature in degrees Celsius. */
    public int temperature;

    /** The current weather condition */
    public String condition;

    /**
     * Constructs a new city given the weather data.
     * @param temperature the current temperature in degrees Celsius.
     * @param condition the current weather condition.
     */
    public City(int temperature, String condition){
        this.temperature = temperature;
        this.condition = condition;
    }
}
