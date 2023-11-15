package com.epam.chatgpttask22.controller;

import com.epam.chatgpttask22.entity.WeatherData;
import com.epam.chatgpttask22.service.WeatherDataService;
import com.epam.chatgpttask22.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired

    private WeatherService weatherService;

    @Autowired
    private WeatherDataService weatherDataService;

    @GetMapping("/city/{city}")
    public ResponseEntity<WeatherData> getWeatherByCity(@PathVariable String city) {
        // Implement logic to check the database first, and if not present, fetch from the API
        return null;
    }

    @GetMapping("/zip/{zipCode}")
    public ResponseEntity<WeatherData> getWeatherByZipCode(@PathVariable String zipCode) {
        // Implement logic to check the database first, and if not present, fetch from the API
        return null;
    }
}
