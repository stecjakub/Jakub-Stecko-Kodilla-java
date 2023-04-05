package com.kodilla.rps;

import java.util.Scanner;

public class Player {
    private String name;
    private int score;
    private Scanner scanner;

    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.scanner = new Scanner(System.in);
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addScore() {
        score++;
    }

    public String chooseGesture() {
        System.out.print(name + ", choose rock, paper, scissors, lizard, or Spock: ");
        String gesture = scanner.nextLine().toLowerCase();
        while (!gesture.equals("rock") && !gesture.equals("paper") && !gesture.equals("scissors") &&
                !gesture.equals("lizard") && !gesture.equals("spock")) {
            System.out.print("Invalid input, please choose rock, paper, scissors, lizard, or Spock: ");
            gesture = scanner.nextLine().toLowerCase();
        }
        return gesture;
    }
}
