package com.epam.chatgpttask22.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class WeatherDataScheduler {

    @Autowired
    private WeatherService weatherService;

    @Autowired
    private WeatherDataService weatherDataService;

    @Scheduled(fixedRate = 3600000) // Refresh every hour (adjust as needed)
    public void refreshWeatherData() {
        // Implement logic to fetch data from the API and update the database
    }
}
