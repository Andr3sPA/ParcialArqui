package com.udea.arqui.parcial.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    @ApiResponse(responseCode = "404", description = "City not found")
    @ApiResponse(responseCode = "500", description = "An internal error ocurred")
    public ResponseEntity<Weather> getWeather(@RequestParam String city, @RequestParam String country) {
        Weather weather = weatherService.getWeather(city, country);
        if (weather == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(weather);
    }

    @PostMapping("/weather")
    @Operation(summary = "Updates or creates a city's weather by its name")
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "404", description = "City not found")
    @ApiResponse(responseCode = "500", description = "An internal error ocurred")
    public ResponseEntity<String> assignWeather(@RequestBody Weather weather, @RequestParam String city) {

        String result = weatherService.assignWeather(weather, city);

        if (result.contains("no existe")) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(result);
    }

}
