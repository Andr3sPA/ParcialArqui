package com.udea.arqui.parcial.rest.controller;

import com.udea.arqui.parcial.rest.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.udea.arqui.parcial.rest.jpa.model.Weather;

@RestController
@RequestMapping("/api/v1")
public class WeatherController {
    @Autowired
    private WeatherService weatherService;
    @GetMapping("/weather")
    public ResponseEntity<Weather> getMethodName(@RequestParam String country, @RequestParam String city) {
     return null;
    }
    @PostMapping("/weather")
    public ResponseEntity<String> postMethodName(@RequestBody Weather weather, @RequestParam String city) {
       return ResponseEntity.ok(weatherService.assignWeather(weather,city));
    }

}
