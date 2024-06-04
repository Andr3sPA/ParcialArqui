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

    /**
     * Retrieves the weather information for a specified city and country.
     *
     * @param city the name of the city
     * @param country the name of the country
     * @return the weather information of the city, or {@code null} if the city is not found
     */
    public Weather getWeather(String city, String country) {
        Optional<City> weather = cityRepository.findByNameAndCountry(city, country);

        if (weather.isEmpty()) {
            return null;
        }
        return weather.get().getWeather();
    }


    /**
     * Assigns the given weather information to a specified city.
     *
     * @param weather the weather information to assign
     * @param cityName the name of the city to which the weather information is to be assigned
     * @return a message indicating whether the assignment was successful or if the city does not exist
     */
    public String assignWeather(Weather weather, String cityName) {
        Optional<City> city = cityRepository.findByName(cityName);

        if (city.isEmpty())
            return "La ciudad %s no existe".formatted(cityName);

        City actualCity = city.get();
        weather.setId(actualCity.getWeather().getId());
        actualCity.setWeather(weather);
        cityRepository.save(actualCity);
        return "Asignacion exitosa";
    }

}
