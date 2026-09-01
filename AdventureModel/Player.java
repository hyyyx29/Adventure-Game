package AdventureModel;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Player Class.
 * This class keeps track of the progress of the player in the game.
 * Core engine inspired by classic adventure-game assignments
 * by Eric Roberts and John Estell; adapted from an educational codebase.
 *  */
public class Player {
    private Room currentRoom; //The current room that the player is located in.
    public ArrayList<AdventureObject> inventory; //The list of items that the player is carrying at the moment.

    /**
     * Player Constructor
     * __________________________
     * Initializes attributes
     *
     * @param currentRoom the room in which the Player begins the game
     */
    public Player(Room currentRoom) {
        this.inventory = new ArrayList<AdventureObject>();
        this.currentRoom = currentRoom;
    }

    /**
     * takeObject
     * _________________________
     * This method adds an object to a player's inventory (and removes it from the room)
     * if the object is present in the room.  It then returns true.
     * If the object is not present in the room, the method
     * returns false.
     *
     * @param object name of the object to take
     * @return true if object is taken, false otherwise
     */
    public boolean takeObject(String object){
        for (int i = 0; i < this.currentRoom.objectsInRoom.size(); i++) {
            if (object.equals(this.currentRoom.objectsInRoom.get(i).getName())) {
                AdventureObject get_object = this.currentRoom.objectsInRoom.get(i);
                this.currentRoom.removeObject(get_object);
                this.inventory.add(get_object);
                return true;
            }
        }
        return false;
    }

    /**
     * dropObject
     * _________________________
     * This method removes an object from the inventory of the player, if it exists.
     * The object, once dropped, should be added to the current room.
     * If the object is not in the inventory, this method will do nothing.
     *
     * @param s String name of prop or object to be removed to the inventory.
     */
    public void dropObject(String s) {
        for (int i = 0; i < this.inventory.size(); i++) {
            if (s.equals(this.inventory.get(i).getName())) {
                AdventureObject drop_object = this.inventory.get(i);
                this.inventory.remove(drop_object);
                this.currentRoom.objectsInRoom.add(drop_object);
            }
        }
    }


    /**
     * setCurrentRoom
     * _________________________
     * Setter method for the current room attribute.
     *
     * @param currentRoom The location of the player in the game.
     */
    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    /**
     * getCurrentRoom
     * _________________________
     * Getter method for the current room attribute.
     *
     * @return current room the player is in.
     */
    public Room getCurrentRoom() {
        return this.currentRoom;
    }

}
