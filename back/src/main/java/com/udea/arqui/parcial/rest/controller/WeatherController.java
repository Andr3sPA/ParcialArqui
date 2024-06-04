package com.udea.arqui.parcial.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.udea.arqui.parcial.rest.jpa.model.Weather;

@RestController
@RequestMapping("/api/v1")
public class WeatherController {

    @GetMapping("/weather")
    public ResponseEntity<Weather> getMethodName(@RequestParam String country, @RequestParam String city) {
        
    }

}
