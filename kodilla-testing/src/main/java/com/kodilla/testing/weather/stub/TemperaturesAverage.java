package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class TemperaturesAverage {

    private double temperatureValue[];

    public TemperaturesAverage(double ...temperatureValue){

        this.temperatureValue = temperatureValue;
    }
    public double calculateAverage(){
        double sum = 0;
        for(int i = 0; i < temperatureValue.length; i++){
            sum = sum + temperatureValue[i];
        }
        return sum / temperatureValue.length;
    }

}
