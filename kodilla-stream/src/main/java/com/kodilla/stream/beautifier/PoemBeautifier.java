package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String something, PoemDecorator poemDecorator){
        String someText = poemDecorator.decorate(something);
        System.out.println("Text beautify words : " + someText );
    }
}
