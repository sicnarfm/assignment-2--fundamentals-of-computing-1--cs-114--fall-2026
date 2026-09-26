import java.util.Scanner;

public class Program4_OneHundredBottlesOfBeer {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    int amountOfBeersOnTheWall = 0;
    int amountOfLoops;

    System.out.println("Please give a number from 0-100");
    amountOfBeersOnTheWall = input.nextInt();

    for(amountOfLoops = amountOfBeersOnTheWall; amountOfLoops >= 0; amountOfBeersOnTheWall--){
      if(amountOfBeersOnTheWall == 1){
        System.out.println("1 bottle of beer on the wall\n1 bottle of beer\nTake one down and pass it around\nno more bottles of beer on the wall");
      }
      else if(amountOfBeersOnTheWall == 0){
        System.out.println("No more bottles of beer on the wall\nno more bottles of beer\nGo to the store and buy some more\n100 bottles of beer on the wall");
        break;
      }
      else{
        System.out.println(amountOfBeersOnTheWall + " bottles of beer on the wall\n" + amountOfBeersOnTheWall + " bottles of beer\nTake one down pass it around\n" + (amountOfBeersOnTheWall-1) + " beers on the wall");
        amountOfLoops = amountOfBeersOnTheWall;
      }

    }
    input.close();
  }
}
