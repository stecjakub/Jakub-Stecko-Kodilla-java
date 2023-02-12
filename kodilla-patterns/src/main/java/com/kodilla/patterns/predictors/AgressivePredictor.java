package com.kodilla.patterns.predictors;

import com.kodilla.patterns.strategy.BuyPredictor;

public class AgressivePredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Aggressive predictor] Buy stock of XYZ";
    }
}
