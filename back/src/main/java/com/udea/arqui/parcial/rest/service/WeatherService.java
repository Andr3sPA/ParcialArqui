package com.udea.arqui.parcial.rest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udea.arqui.parcial.rest.jpa.model.City;
import com.udea.arqui.parcial.rest.jpa.model.Weather;
import com.udea.arqui.parcial.rest.jpa.repository.CityRepository;

@Service
public class WeatherService {

    @Autowired
    private CityRepository cityRepository;

    public Weather getWeather(String city, String country) {
        Optional<City> weather = cityRepository.findByNameAndCountry(city, country);

        if (weather.isEmpty()) {
            return null;
        }
        return weather.get().getWeather();
    }

    public String assignWeather(Weather weather, String cityName) {
        Optional<City> city = cityRepository.findByName(cityName);

        if (city.isEmpty())
            return "La ciudad %s no existe".formatted(cityName);

        City actualCity = city.get();
        actualCity.setWeather(weather);
        cityRepository.save(actualCity);
        return "Asignacion exitosa";
    }
}
