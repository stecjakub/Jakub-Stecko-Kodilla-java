package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - stream");

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("This is the first method", (something -> something.toUpperCase()));
        poemBeautifier.beautify("This is the second method", something -> something.toLowerCase());
        poemBeautifier.beautify("This is the third method", something -> "ACB " + something );
        poemBeautifier.beautify("This is the fourth method", something -> " ' " + something + " ' " );


    }
}
