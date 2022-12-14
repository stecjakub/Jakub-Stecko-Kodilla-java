package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class World {
    private List<Continents> continentsList = new ArrayList<>();

    public void addContinent(Continents continents){
        continentsList.add(continents);
    }
    public BigDecimal getPeopleQuantity(){
        return continentsList.stream().flatMap(continents -> continents.getCountryList().stream()).map(country -> country.getPeopleQuantity()).reduce(BigDecimal.ZERO,(sum,current) ->sum = sum.add(current));
    }


}
