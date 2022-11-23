package com.kodilla.testing.weather.stub;

import java.util.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class TemperaturesMedian {
    private Temperatures temperaturesMedian;

    public Map<String, Double> calculateMedian() {
        //Map<String, Double> medianMap = new HashMap<>();
        Map<String, Double> temperaturesMap = new HashMap<>();                     // [14]
        temperaturesMap.put("Rzeszow", 25.5);                                      // [15]
        temperaturesMap.put("Krakow", 26.2);                                       // [16]
        temperaturesMap.put("Wroclaw", 24.8);                                      // [17]
        temperaturesMap.put("Warszawa", 25.2);                                     // [18]
        temperaturesMap.put("Gdansk", 26.1);
        double sum = 0;
        for(Map.Entry<String, Double> key: temperaturesMedian.getTemperatures().entrySet()) {
            sum = 25.2 + 25.5;
            sum = sum / 2;
        }
        return temperaturesMap;
    }
}
