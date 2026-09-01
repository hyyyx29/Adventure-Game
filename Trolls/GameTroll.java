package Trolls;

import AdventureModel.Player;

import java.util.*;

/**
 * Class GameTroll.
 *  *  */
public class GameTroll implements Troll {

    //Write your own code here!

    /**
     * Print GameTroll instructions for the user
     */
    public void giveInstructions() {
        System.out.println("Welcome to the Rock, Paper, Scissors game!\nPlease enter your choice below (1 - Rock, 2 - Paper, 3 - Scissors)\nPlease input a valid answer each time.\n(Only 1, 2, 3 are accepted.)");
    }

    /**
     * Play the GameTroll game
     *
     * @return true if player wins the game, else false
     */
    public boolean playGame() {
        giveInstructions();
        while (true) {
            Boolean validInput = false;
            int player_choice = 0;
            while (!(validInput)) {
                try {
                    Scanner scanner = new Scanner(System.in);
                    player_choice = scanner.nextInt();
                    if (player_choice < 1 | player_choice > 3) {
                        validInput = false;
                    } else {
                        validInput = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input!");
                    validInput = false;
                }
            }
            Random random = new Random();
            int computer_choice = random.nextInt(3) + 1;
            if (player_choice == computer_choice) {
                System.out.println("It was a tie.");
            } else if ((player_choice == 1 & computer_choice == 2) | (player_choice == 2 & computer_choice == 3) | (player_choice == 3 & computer_choice == 1)) {
                System.out.println("Sorry you lost.");
                return false;
            } else {
                System.out.println("You won.");
                return true;
            }
        }
    }

    /**
     * Main method, use for debugging
     *
     * @param args: Input arguments
     */
    public static void main(String [] args) throws InterruptedException {
        GameTroll s = new GameTroll();
        boolean a = s.playGame();
    }
}
