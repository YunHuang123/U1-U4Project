import java.util.Scanner;
public class SeaAdventureRunner {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        Scanner s = new Scanner(System.in);

        int length = (int)(Math.random() * 401) + 100;
        int width = (int)(Math.random() * 56) + 15;
        int height = (int)(Math.random() * 431) + 20;
        System.out.print("You woke up and realized that you are not in your bed, you are alone on a desert island!!! In front of you are 4 ships that are different in size. Now here's your only chance to unlock one of the ships.\nWhich ship would you like to choose (ship 1 to 4, with 1 the hardest to unlock and 4 the easiest)?");
        int shipNum = i.nextInt();

        SeaAdventure Giant = new SeaAdventure(length, width, height);

        if (shipNum == 1) {
            System.out.println("Please think of a palindrome (a word that is spelled the same backwards) that is at least 6 letters (all lowercase): ");
            String answer = s.nextLine();
            if (SeaAdventure.shipOnePw(answer)) {
                System.out.println("Great job, you have unlocked ship 1");
                System.out.println(Giant.toString());
            }
            else {
                System.out.println("Sorry, your password is incorrect, you have lost your chance to leave this island.");
            }
        }
        if (shipNum == 2) {
            System.out.println("What is something that can run but cannot walk? (all lowercase)");
            String answer = s.nextLine();
            if (SeaAdventure.shipTwoPw(answer)) {
                System.out.println("Great job, you have unlocked ship 2");
                System.out.println(Giant.toString());
            }
            else {
                System.out.println("Sorry, your password is incorrect, you have lost your chance to leave this island.");
            }
        }
        if (shipNum == 3) {
            System.out.println("What is this thing that walks on 4 legs in the morning, two legs in the afternoon, and 3 legs at night? (all lowercase)");
            String answer = s.nextLine();
            if (SeaAdventure.shipThreePw(answer)) {
                System.out.println("Great job, you have unlocked ship 3");
                System.out.println(Giant.toString());
            }
            else {
                System.out.println("Sorry, your password is incorrect, you have lost your chance to leave this island.");
            }
        }
        if (shipNum == 4) {
            System.out.println("You chose the fourth ship...");
            System.out.println(Giant.toString());
        }







    }
}
