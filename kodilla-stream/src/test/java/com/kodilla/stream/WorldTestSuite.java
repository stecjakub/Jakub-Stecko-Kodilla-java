package com.kodilla.stream;

import com.kodilla.stream.world.Continents;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity(){
        World world = new World();

        Continents Europe = new Continents("Europe");
        Continents Asia = new Continents("Asia");
        Continents NorthAmerica = new Continents("NorthAmerica");
        Continents SouthAmerica = new Continents("SouthAmerica");
        Continents Australia = new Continents("Australia");
        Continents Africa = new Continents("Africa");
        Asia.addCountry(new Country("China",new BigDecimal(1400000000)));
        Asia.addCountry(new Country("India",new BigDecimal(1200000000)));
        Asia.addCountry(new Country("Japan", new BigDecimal(13000000)));
        Europe.addCountry(new Country("Poland", new BigDecimal(38000000)));
        Europe.addCountry(new Country("Italy", new BigDecimal(59000000)));
        Europe.addCountry(new Country("Sweden",new BigDecimal(10000000)));
        NorthAmerica.addCountry(new Country("USA",new BigDecimal(330000000)));
        NorthAmerica.addCountry(new Country("Mexico",new BigDecimal(130000000)));
        NorthAmerica.addCountry(new Country("Canada",new BigDecimal(38000000)));
        SouthAmerica.addCountry(new Country("Argentina",new BigDecimal(45000000)));
        SouthAmerica.addCountry(new Country("Brazil",new BigDecimal(214000000)));
        SouthAmerica.addCountry(new Country("Chile",new BigDecimal(19000000)));
        Australia.addCountry(new Country("Australia",new BigDecimal(25000000)));
        Africa.addCountry(new Country("Egypt",new BigDecimal(104000000)));
        Africa.addCountry(new Country("RPA",new BigDecimal(57000000)));
        Africa.addCountry(new Country("Kongo",new BigDecimal(5000000)));


        world.addContinent(Europe);
        world.addContinent(Asia);
        world.addContinent(NorthAmerica);
        world.addContinent(SouthAmerica);
        world.addContinent(Africa);
        world.addContinent(Australia);


        BigDecimal peopleQuantity = world.getPeopleQuantity();
        System.out.println(peopleQuantity);

        Assertions.assertEquals(new BigDecimal("3687000000"),peopleQuantity);



    }
}
