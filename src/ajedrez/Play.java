package ajedrez;

import javaboard.Executor;
import javaboard.Player;
import javaboard.PlayerCPURandom;
import javaboard.PlayerHumanTerminal;

public class Play {

    // Play a chess game using the Executor
    public static void main(String[] args) {
        Ajedrez game = new Ajedrez();

        Player[] players = {new PlayerHumanTerminal(), new PlayerCPURandom()};

        Executor exec = new Executor();
        exec.runGame(game,players);
    }
}