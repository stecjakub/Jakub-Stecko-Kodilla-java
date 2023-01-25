package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {
    @Mock
    private Temperatures temperaturesMock;
    private Map<String, Double> temperaturesMap = new HashMap<>();

    @BeforeEach
    void start() {
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }

    @Test
    void testCalculateForecastWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testAverageWithMock() {
        //Given

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

<<<<<<< HEAD
        //When
        double average = weatherForecast.calculateAverage(temperaturesMock.getTemperatures());
=======

        Map<String, Double> map = weatherForecast.calculateForecast();
        double average = 0;
        for (Map.Entry<String, Double> temp :
                map.entrySet()) {
            average += temp.getValue();
        }
        average /= map.size();
>>>>>>> e6366ea3253d9801d73135e5d6880464a89602d5

        //Then
        Assertions.assertEquals(25.560000000000002, average);
    }

    @Test
    void testMedianWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        double median;
        //When

        median = weatherForecast.calculateMedian(temperaturesMock.getTemperatures());

        //Then
        Assertions.assertEquals(25.5, median);
    }
}
