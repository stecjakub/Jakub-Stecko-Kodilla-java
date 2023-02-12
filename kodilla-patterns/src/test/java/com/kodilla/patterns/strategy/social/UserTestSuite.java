package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies(){
        //Given
        User ygeneration = new YGeneration("Marcin");
        User zgeneration = new ZGeneration("Anna");
        User millenials = new Millenials("Piotr");

        //When
        String result1 = ygeneration.predict();
        String result2 = zgeneration.predict();
        String result3 = millenials.predict();

        //Then
        assertEquals("I am using Twitter", result1);
        assertEquals("I am using Snapchat", result2);
        assertEquals("I am using Facebook", result3);

    }
    @Test
    void testIndividualSharingStrategy(){
        User ygeneration = new YGeneration("");
        User zgeneration = new ZGeneration("");
        User millenials = new Millenials("");

        ygeneration.setSocialPublisher(new FacebookPublisher());
        zgeneration.setSocialPublisher(new SnapchatPublisher());
        millenials.setSocialPublisher(new TwitterPublisher());
        String result4 = ygeneration.predict();
        String result5 = zgeneration.predict();
        String result6 = millenials.predict();

        assertEquals("I am using Facebook", result4);
        assertEquals("I am using Snapchat", result5);
        assertEquals("I am using Twitter", result6);
    }
}
