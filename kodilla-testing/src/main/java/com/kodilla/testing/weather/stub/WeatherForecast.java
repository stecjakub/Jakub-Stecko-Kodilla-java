package com.kodilla.testing.weather.stub;

import java.util.*;
import java.util.stream.Collectors;

public class WeatherForecast {
    private Temperatures temperatures;
    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    public double calculateAverage(Map<String, Double> temperaturesMap){
        double average = 0;
        for(Double temperatures: temperatures.getTemperatures().values()){
            average += temperatures / temperaturesMap.size();
        }
        return average;
    }
    public double calculateMedian(Map<String, Double> temperaturesMap){
        List<Double>medianList = new ArrayList<>();
        for (Map.Entry<String, Double> temperature : temperaturesMap.entrySet()) {
            medianList.add(temperature.getValue());
        }

        Collections.sort(medianList);
        double median;

        if (medianList.size() % 2 == 0) {
            median = (medianList.get(medianList.size() / 2) + medianList.get(medianList.size() / 2 - 1)) / 2;
        } else {
            median = medianList.get(medianList.size() / 2);
        }
        return median;
    }
}
