package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        String r = "rock";
        String p = "paper";
        String s = "scissors";

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String computerPlay;
        String userPlay;
        String[] plays = {r, p, s};

        int number;
        boolean end = false;

        System.out.println("Welcome" + "\n" + "You play Rock-Paper-Scissors game");
        while (!end) {
            System.out.println("Choose from three different option: " + "\n" + "rock, paper or scissors");
            userPlay = scanner.nextLine();

            number = random.nextInt(3);
            computerPlay = plays[number];

            System.out.println("Your move: " + userPlay + "\n" + "Computer Move: " + computerPlay);

            if (userPlay.equals(r) && computerPlay.equals(s) ||
                    userPlay.equals(s) && computerPlay.equals(p) ||
                    userPlay.equals(p) && computerPlay.equals(r)) {
                System.out.println("User win");
            } else if (userPlay.equals(s) && computerPlay.equals(r) ||
                    userPlay.equals(r) && computerPlay.equals(p) ||
                    userPlay.equals(p) && computerPlay.equals(s)) {
                System.out.println("Computer Win");
            } else if (userPlay.equals(computerPlay)) {
                System.out.println("Tie!");
            }else {
                System.out.println("Invalid Game");
            }
        }
    }
}