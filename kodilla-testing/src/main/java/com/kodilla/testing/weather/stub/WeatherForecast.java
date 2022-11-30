package com.kodilla.testing.weather.stub;

import java.util.*;

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
    public Double calculateAverage(){
        Map<String,Double> averageMap = new HashMap<>();
        double sum =0;
        double average = 0;
        for(Double values : temperatures.getTemperatures().values()){
            sum += values;
            average = sum / 5;
        }
        return average;
    }
    public Double calculateMedian() {
        Map<String, Double> medianMap = new HashMap<>();
        double median = 0;
        for (Map.Entry<String, Double> t :
                temperatures.getTemperatures().entrySet()) {
            if (medianMap.size() % 2 == 0) {
                median = (t.getValue().doubleValue() + 1) ;
            }else{
                median = (t.getValue().doubleValue() - 1 ) / 2;
            }
            return median;
        }
        return median ;
    }
}
