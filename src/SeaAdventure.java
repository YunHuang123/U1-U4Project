public class SeaAdventure {

    private int length;
    private int width;
    private int height;
    private int count;

    public SeaAdventure (int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public SeaAdventure (int length, int width) {
        this.length = length;
        this.width = width;
        height = 250;
    }
    public SeaAdventure (int length) {
        this.length = length;
        width = 40;
        height = 250;
    }
    public SeaAdventure () {
        length = 250;
        width = 25;
        height = 150;
    }

    public boolean willSurviveTsunami () {
        if (length >= 300 && width >= 30 && height >= 200) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Ship Length: " + length + "\nShip Width: " + width + "\nShip Height: " + height;
    }

    public static boolean shipOnePw (String password) {
        for (int i = 0; i <= password.length() / 2; i ++) {
            char a = password.charAt(0);
            char b = password.charAt(password.length() - 1);
            if (a != b) {
                return false;
            }
        }
        return true;
    }

    public static boolean shipTwoPw (String password) {
        String correct = "river";
        if (password == correct) {
            return true;
        }
        return false;
    }

    public static boolean shipThreePw (String password) {
        String correct = "human";
        if (password == correct) {
            return true;
        }
        return false;
    }


}
