import java.util.Scanner;
import java.util.Random;

public class DiceGame {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    int total = 0;

    System.out.println("Welcome to the Dice Game!\n");

    System.out.print("Enter how many dice you want to roll: ");
    int numDice = input.nextInt();
    System.out.println();

    for(int i = 0; i < numDice; i++) {
      int randomNumber = 1 + rand.nextInt(6);
      total += randomNumber;
      System.out.println("Die #" + ( i + 1 ) + ": " + randomNumber);
    }

    System.out.println("\nTotal = " + total);

  }

}
