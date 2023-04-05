package com.kodilla.rps;

import java.util.Random;

public class ComputerPlayer extends Player {
    private Random random;

    public ComputerPlayer(String name) {
        super(name);
        this.random = new Random();
    }

    @Override
    public String chooseGesture() {
        int choice = random.nextInt(5);
        switch (choice) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            case 3:
                return "lizard";
            default:
                return "spock";
        }
    }
}
