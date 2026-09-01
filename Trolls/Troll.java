package Trolls;


/**
 * Troll interface for Trolls used in the adventure game.
 *  *  */
public interface Troll {

    /**
     * giveInstructions
     * _________________________
     * All Trolls should explain how their game is played
     */
    public void giveInstructions();

    /**
     * playGame
     * _________________________
     * Play the Trolls game
     *
     * @return true if player wins the game, else false
     */
    public boolean playGame();
}
