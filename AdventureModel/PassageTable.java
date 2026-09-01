package AdventureModel;

import java.util.*;

/**
 * The PassageTable class keeps track of all the exits or locations
 * a player can go from a room.
 * Core engine inspired by classic adventure-game assignments
 * by Eric Roberts and John Estell; adapted from an educational codebase.
 *  */
public class PassageTable {

    public List<Passage> passages; //A list of all the Passages that exists from a room.

    /**
     * PassageTable constructor
     */
    public PassageTable() {
        this.passages = new ArrayList<>();
    }

    /**
     * addDirection
     * ____________________
     * This method adds an exit or passage to the table.
     *
     * @param entry: A Passage representing a particular exit from a room.
     */
    void addDirection(Passage entry) {
        passages.add(entry);
    }

    /**
     * getPassages
     * ____________________
     * Getter method for passages.
     *
     * @return this.passages
     * A list of all the Passages that exists from a room.
     */
    public List<Passage> getPassages(){ return this.passages; }

}