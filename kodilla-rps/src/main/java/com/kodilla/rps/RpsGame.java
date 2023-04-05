package com.kodilla.rps;

public class RpsGame {
    public static void main(String[] args) {
        Player humanPlayer = new Player("Player");
        Player computerPlayer = new ComputerPlayer("Computer");

        Game game = new Game(humanPlayer, computerPlayer);
        game.playGame();
    }
}
