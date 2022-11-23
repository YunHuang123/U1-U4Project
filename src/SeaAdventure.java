public class SeaAdventure {

    private int length;
    private int width;
    private int height;

    public SeaAdventure (int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public SeaAdventure () {
        length = 250;
        width = 25;
        height = 150;
    }

    public void increaseLength() {
        length += 100;
    }

    public void increaseWidth () {
        width += 10;
    }

    public void increaseHeight () {
        height += 50;
    }

    public boolean willSurviveTsunami () {
        if (length >= 300 && width >= 30 && height >= 200) {
            return true;
        }
        else {
            return false;
        }
    }

    public String toString() {
        return "Ship Length: " + length + "\nShip Width: " + width + "\nShip Height: " + height;
    }

    public static boolean shipOnePw (String password) {
        StringBuilder reversed = new StringBuilder(password);
        reversed.reverse();
        String rev = reversed.toString();
        if (password.equals(rev) && password.length() >= 6) {
            return true;
        }
        return false;
    }

    public static boolean shipTwoPw (String password) {
        if (password.equals("river")) {
            return true;
        }
        return false;
    }

    public static boolean shipThreePw (String password) {
        if (password.equals("human")) {
            return true;
        }
        return false;
    }

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

