package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    public Map<String, Double> calculateAverage(){
        Map<String, Double > calculateAverageMap = new HashMap<>();
        double average = 0;
        for (Map.Entry<String, Double> temp :
                calculateAverageMap.entrySet()) {
            average += temp.getValue();
        }
        average /= calculateAverageMap.size();
        System.out.println(average);
        return calculateAverageMap;
    }
    public List<Double> calculateMedian(){
        Map<String, Double> calculateMedianMap = new HashMap<>();
        List<Double> sorted = calculateMedianMap.values().stream().sorted().collect(Collectors.toList());
        double median = 0;

        if (sorted.size() % 2 == 1)
            median = sorted.get(sorted.size() / 2 + 1);
        else {
            median = .5 * (sorted.get(sorted.size() / 2) + sorted.get(sorted.size() / 2 + 1));
        }
        System.out.println(median);
        return sorted;
    }
}
