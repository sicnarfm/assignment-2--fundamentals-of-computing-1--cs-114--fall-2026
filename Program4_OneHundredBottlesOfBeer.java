import java.util.Scanner;

public class Program4_OneHundredBottlesOfBeer {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    int amountOfBeersOnTheWall = 0;
    int amountOfLoops;

    System.out.println("Please give a number from 0-100");
    amountOfBeersOnTheWall = input.nextInt();


    input.close();
  }
}
