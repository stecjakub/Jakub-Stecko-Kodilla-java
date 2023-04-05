package com.kodilla.rps;

public class Game {
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void playRound() {
        String gesture1 = player1.chooseGesture();
        String gesture2 = player2.chooseGesture();
        System.out.println(player1.getName() + " chose " + gesture1);
        System.out.println(player2.getName() + " chose " + gesture2);
        if (gesture1.equals(gesture2)) {
            System.out.println("It's a tie!");
        } else if ((gesture1.equals("rock") && (gesture2.equals("scissors") || gesture2.equals("lizard"))) ||
                (gesture1.equals("paper") && (gesture2.equals("rock") || gesture2.equals("Spock")) ) ||
                (gesture1.equals("scissors") && (gesture2.equals("paper") || gesture2.equals("lizard")) ) ||
                (gesture1.equals("lizard") && (gesture2.equals("paper") || gesture2.equals("Spock")) ) ||
                (gesture1.equals("spock") && (gesture2.equals("rock") || gesture2.equals("scissors")) )) {
            System.out.println(player1.getName() + " wins!");
            player1.addScore();
        } else {
            System.out.println(player2.getName() + " wins!");
            player2.addScore();
        }
    }

    public void playGame() {
        System.out.println("Let's play Rock, Paper, Scissors, Lizard, Spock!");
        System.out.println(player1.getName() + " vs. " + player2.getName());
        System.out.println("First to three wins!");

        while (player1.getScore() < 3 && player2.getScore() < 3) {
            playRound();
        }

        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins the game!");
        } else {
            System.out.println(player2.getName() + " wins the game!");
        }
    }
}
