import java.util.Scanner;
public class SeaAdventureRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int length = (int)(Math.random() * 401) + 100;
        int width = (int)(Math.random() * 56) + 15;
        int height = (int)(Math.random() * 431) + 20;
        SeaAdventure Giant = new SeaAdventure(length, width, height);

        

    }
}
