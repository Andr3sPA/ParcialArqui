package com.udea.arqui.parcial.rest.service;

import com.udea.arqui.parcial.rest.jpa.model.City;
import com.udea.arqui.parcial.rest.jpa.model.Weather;
import com.udea.arqui.parcial.rest.jpa.repository.CityRepository;
import com.udea.arqui.parcial.rest.jpa.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    @Autowired
    private CityRepository cityRepository;

    public String assignWeather(Weather weather,String cityName) {
        City city= cityRepository.findByName(cityName);
        city.setWeather(weather);
        return "Asignacion exitosa";
    }
}
