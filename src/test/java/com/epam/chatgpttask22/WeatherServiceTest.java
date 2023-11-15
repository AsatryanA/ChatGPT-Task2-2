package com.epam.chatgpttask22;

import com.epam.chatgpttask22.entity.WeatherData;
import com.epam.chatgpttask22.service.WeatherService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class WeatherServiceTest {

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private WeatherService weatherService;

    @Test
    void testGetWeatherDataByCity() {
        // Mocking the API response
        String mockCity = "MockCity";
        String apiUrl = String.format("mockApiUrl/weather?q=%s&appid=mockApiKey", mockCity);
        WeatherData mockWeatherData = new WeatherData(/* mock data */);
        Mockito.when(restTemplate.getForObject(apiUrl, WeatherData.class)).thenReturn(mockWeatherData);

        // Testing the service method
        WeatherData result = weatherService.getWeatherDataByCity(mockCity);

        // Asserting the result
        // Add appropriate assertions based on your actual data and logic
        // Example: assertEquals(expected, result.getSomeField());
    }

    @Test
    void testGetWeatherDataByZipCode() {
        // Similar to the testGetWeatherDataByCity method, but for zip code
    }
}
