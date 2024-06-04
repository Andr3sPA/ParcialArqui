package com.udea.arqui.parcial.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udea.arqui.parcial.rest.jpa.model.Weather;
import com.udea.arqui.parcial.rest.jpa.repository.CityRepository;

@Service
public class WeatherService {

    @Autowired
    private CityRepository cityRepository;

    public Weather getWeather(String city, String country) {
        return cityRepository.findByNameAndCountry(city, country)
                .orElseThrow().getWeather();
    }
}
