package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Continents {
    private final String continentsName;
    private final List<Country> countryList = new ArrayList<>();

    public Continents(final String continentsName) {
        this.continentsName = continentsName;
    }
    public List<Country> getCountryList(){
        return new ArrayList<Country>(countryList);
    }
    public void addCountry(Country country){
        countryList.add(country);
    }
}

