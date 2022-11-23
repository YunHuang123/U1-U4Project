/**
 * SeaAdventure represents the game, everything required for the game is in this class
 */
public class SeaAdventure {

    private int length;
    private int width;
    private int height;

    /**
     * A constructor of the SeaAdventure class. This SeaAdventure creates an object with three parameters that are randomly assigned in the runner class
     * @param length represents the length of the ship
     * @param width represents the width of the ship
     * @param height represents the height of the ship
     */
    public SeaAdventure (int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    /**
     * A constructor of the SeaAdventure class. This SeaAdventure creates an object with zero parameters, the length, width, and height are assigned below
     */
    public SeaAdventure () {
        length = 250;
        width = 25;
        height = 150;
    }

    /**
     * A method of the SeaAdventure class. This method increases the length of the object (ship) by 100
     */
    public void increaseLength() {
        length += 100;
    }

    /**
     * A method of the SeaAdventure class. This method increases the width of the object (ship) by 10
     */
    public void increaseWidth () {
        width += 10;
    }

    /**
     * A method of the SeaAdventure class. This method increases the height of the object (ship) by 50
     */
    public void increaseHeight () {
        height += 50;
    }

    /**
     * A method of the SeaAdventure class. This method checks to see if the size of the object (ship's length, width, and height) is large enough to survive a tsunami
     * @return true if the ship is large enough to survive a tsunami, return false if it is not large enough
     */
    public boolean willSurviveTsunami () {
        if (length >= 300 && width >= 30 && height >= 200) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * A method of the SeaAdventure class. This is a method that returns the stats of the object (ship)
     * @return the length, width, and height of the object (ship)
     */
    public String toString() {
        return "Ship Length: " + length + "\nShip Width: " + width + "\nShip Height: " + height;
    }

    /**
     * A method of the SeaAdventure class. This method is used to see if the user answers the given question correctly for the first ship
     * @param password a String that represents the user's input for the given question
     * @return true if the user input reaches the requirements, return false otherwise
     */
    public static boolean shipOnePw (String password) {
        StringBuilder reversed = new StringBuilder(password);
        reversed.reverse();
        String rev = reversed.toString();
        if (password.equals(rev) && password.length() >= 6) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * A method of the SeaAdventure class. This method is used to see if the user answers the given question correctly for the second ship
     * @param password a String that represents the user's input for the given question
     * @return return true if the user input matches the given answer, return false otherwise
     */
    public static boolean shipTwoPw (String password) {
        if (password.equals("river")) {
            return true;
        }
        return false;
    }

    /**
     * A method of the SeaAdventure class. This method is used to see if the user answers the given question correctly for the third ship
     * @param password a String that represents the user's input for the given question
     * @return return true if the user input matches the given answer, return false otherwise
     */
    public static boolean shipThreePw (String password) {
        if (password.equals("human")) {
            return true;
        }
        return false;
    }

    /**
     * A method of the SeaAdventure class. This method includes the scenes of what happens after the user enters a user input for their choice of route
     * @param path an integer that represents the user's input
     * @return the scenes of what happens after the user enters a number
     */
    public String adventureOne (int path) {
        if (path == 1) {
            return "The journey back home had began and you feel really excited! But this did not last long, you have sailed for 10 days and haven't seen anything. \nYou thank God that you had found lots of food on the ship.";
        }
        else if (path == 2) {
            return "You felt like the ship was too small, so you decide to increase its size a bit.";
        }
        else if (path == 3){
            return "You caught a cold, but thank god it didn't cause much problem.";
        }
        else {
            return "Sorry, this path does not exist.";
        }
    }

    /**
     * A method of the SeaAdventure class. This method includes the scenes of what happens after the user enters a user input for their choice of route
     * @param path an integer that represents the user's input
     * @return the scenes of what happens after the user enters a number
     */
    public String adventureTwo (int path) {
        if (path == 1) {
            return "Another 10 days have past, you started to wonder when you will get back to land.";
        }
        else if (path == 2) {
            return "You died from the worsening of the cold.";
        }
        else if (path == 3) {
            return "You've encountered a pod of dolphins, they swam around your ship and you interacted with them. You finally experienced something interesting.";
        }
        else {
            return "Sorry, this path does not exist.";
        }
    }

    /**
     * A method of the SeaAdventure class. This method includes the scenes of what happens after the user enters a user input for their choice of route
     * @param path an integer that represents the user's input
     * @return the scenes of what happens after the user enters a number
     */
    public String adventureThree (int path) {
        if (path == 1) {
            return "You've encountered a tsunami and died.";
        }
        else if (path == 2) {
            return "You sailed on the sea and encountered a pirate ship. They saw your ship and sailed towards you, but you don't know what to do. \nYou tried to turn the ship and run, but you failed to escape and the pirates managed to board your ship. You died.";
        }
        else if (path == 3) {
            return "Another 10 days have past, during the past days, you found a way to increase the size of your ship.";
        }
        else {
            return "Sorry, this path does not exist.";
        }
    }

    /**
     * A method of the SeaAdventure class. This method includes the scenes of what happens after the user enters a user input for their choice of route
     * @param path an integer that represents the user's input
     * @return the scenes of what happens after the user enters a number
     */
    public String adventureFour (int path) {
        if (path == 1) {
            return "You've encountered a tsunami and got DESTROYED.";
        }
        else if (path == 2) {
            return "10 days have past, you went back to being bored, but you have a feeling that you can almost see land.";
        }
        else if (path == 3) {
            return "You felt bored so you jumped off the ship and swam in the sea water. But then, you saw a shark........................................................................You swam as fast as you could back to the ship and barely managed to survive!!!";
        }
        else {
            return "Sorry, this path does not exist.";
        }
    }

    /**
     * A method of the SeaAdventure class. This method includes the scenes of what happens after the user enters a user input for their choice of route
     * @param path an integer that represents the user's input
     * @return the scenes of what happens after the user enters a number
     */
    public String adventureFive (int path) {
        if (path == 1) {
            return "You finally saw land! You sailed the ship in that direction and officially wave goodbye to the hellish life of the past few days. \nGreat job! You survived!";
        }
        else if (path == 2) {
            return "You had a feeling that you were closer to the surface of the ocean than yesterday, but you didn't think about too much. \nAfter a few days, you've realized that there's a hole on the bottom of your ship! You don't know what happened and accepted your fate of death.";
        }
        else if(path == 3) {
            return "You've encountered a hurricane. Your ship flipped over and you died.";
        }
        else {
            return "Sorry, this path does not exist. (Type 99 to wrap up the game)";
        }
    }





}

