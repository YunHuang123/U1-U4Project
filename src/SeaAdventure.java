public class SeaAdventure {

    private int ship;
    private int length;
    private int width;
    private int height;
    private int size;
    private int count;

    public SeaAdventure (int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public SeaAdventure () {
        ship = 320;
    }

    public boolean willSurviveTsunami () {
        if (size >= 530 || ship >= 530) {
            return true;
        }
        return false;
    }

    public String adventure () {

    }

}
