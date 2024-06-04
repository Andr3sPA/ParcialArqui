package com.udea.arqui.parcial.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.udea.arqui.parcial.rest.jpa.model.Weather;
import com.udea.arqui.parcial.rest.service.WeatherService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/v1")
@Tag(name = "Weather information")
public class WeatherController {

    @Autowired
    WeatherService weatherService;

    @GetMapping("/weather")
    @Operation(summary = "Get a city's weather by its name and its country.")
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "500", description = "An internal error ocurred")
    public ResponseEntity<Weather> getWeather(@RequestParam String city, @RequestParam String country) {
        return ResponseEntity.ok().body(weatherService.getWeather(city, country));
    }

}
