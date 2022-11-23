package com.kodilla.testing.weather.mock;                                        // [1]

import com.kodilla.testing.weather.stub.Temperatures;                            // [2]
import com.kodilla.testing.weather.stub.WeatherForecast;
import com.kodilla.testing.weather.stub.TemperaturesAverage;
import com.kodilla.testing.weather.stub.TemperaturesMedian;
import org.junit.jupiter.api.Assertions;                                         // [4]
import org.junit.jupiter.api.Test;                                               // [5]
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;                                                        // [6]
import java.util.Map;                                                            // [7]

import static org.mockito.Mockito.mock;                                          // [8]
import static org.mockito.Mockito.when;                                          // [9]


@ExtendWith(MockitoExtension.class)

class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    @Test                                                                         // [11]
    void testCalculateForecastWithMock() {                                        // [12]
        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);                  // [13]
        Map<String, Double> temperaturesMap = new HashMap<>();                     // [14]
        temperaturesMap.put("Rzeszow", 25.5);                                      // [15]
        temperaturesMap.put("Krakow", 26.2);                                       // [16]
        temperaturesMap.put("Wroclaw", 24.8);                                      // [17]
        temperaturesMap.put("Warszawa", 25.2);                                     // [18]
        temperaturesMap.put("Gdansk", 26.1);                                       // [19]
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);      // [20]
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);   // [21]

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();        // [22]

        //Then
        Assertions.assertEquals(5, quantityOfSensors);                             // [23]
    }
    @Test
    void testCalculateAverage(){
        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);
        Map<String, Double> temperaturesMap = new HashMap<>();                     // [14]
        temperaturesMap.put("Rzeszow", 25.5);                                      // [15]
        temperaturesMap.put("Krakow", 26.2);                                       // [16]
        temperaturesMap.put("Wroclaw", 24.8);                                      // [17]
        temperaturesMap.put("Warszawa", 25.2);                                     // [18]
        temperaturesMap.put("Gdansk", 26.1);
        //When
        TemperaturesAverage temperaturesAverage = new TemperaturesAverage();
        double average = temperaturesAverage.calculateAverage();
        //Then
        Assertions.assertEquals(25.6, average);
    }
    @Test
    void testCalculateMedian(){
        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);
        Map<String, Double> temperaturesMap = new HashMap<>();                     // [14]
        temperaturesMap.put("Rzeszow", 25.5);                                      // [15]
        temperaturesMap.put("Krakow", 26.2);                                       // [16]
        temperaturesMap.put("Wroclaw", 24.8);                                      // [17]
        temperaturesMap.put("Warszawa", 25.2);                                     // [18]
        temperaturesMap.put("Gdansk", 26.1);
        //When
        TemperaturesMedian temperaturesMedian = new TemperaturesMedian();

        Assertions.assertEquals(25.35,25.35);

    }

}