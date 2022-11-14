import java.util.Scanner;
public class SeaAdventureRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int length = (int)(Math.random() * 401) + 100;
        int width = (int)(Math.random() * 56) + 15;
        int height = (int)(Math.random() * 431) + 20;
        System.out.print("Which ship would you like to choose (ship 1 to 4, with 1 the hardest to unlock and 4 the easiest)?");
        int shipNum = s.nextInt();

        SeaAdventure Giant = new SeaAdventure(length, width, height);

        if (shipNum == 1) {
            System.out.println("Please think of a palindrome (a word that is spelled the same backwards) that is at least 6 letters: ");
            String answer = s.nextLine();
            if (SeaAdventure.shipOnePw(answer) == true) {
                width = 40;
                height = 250;
                System.out.print("Great job, you have unlocked ship 1");
            }
        }
        if (shipNum == 2) {
            System.out.println("What is something that can run but cannot walk?");
            String answer = s.nextLine();
            if (SeaAdventure.shipTwoPw(answer) == true) {
                height = 250;
                System.out.print("Great job, you have unlocked ship 2");
            }
        }
        if (shipNum == 3) {
            System.out.println("What is this thing that walks on 4 legs in the morning, two legs in the afternoon, and 3 legs at night?");
            String answer = s.nextLine();
            if (SeaAdventure.shipThreePw(answer) == true) {
                System.out.print("Great job, you have unlocked ship 3");
            }
        }
        if (shipNum == 4) {
            length = 250;
            width = 25;
            height = 150;
            System.out.println("You chose the fourth ship...");
        }

        System.out.println(Giant.toString());





        

    }

}
