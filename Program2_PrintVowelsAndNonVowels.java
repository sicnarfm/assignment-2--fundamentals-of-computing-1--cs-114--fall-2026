import java.util.Scanner;

public class Program2_PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int amountOfVowels = 0;
    int amountOfNonVowels = 0;
    int characterLocation;
    String userInput;
    String vowels = "aeiouAEIOU";

    System.out.println("Please give Input...");
    userInput = input.nextLine();

    for(characterLocation = 0; characterLocation <= userInput.length()-1; characterLocation++){

      char character = userInput.charAt(characterLocation);

      if(vowels.indexOf(character) >= 0){

        amountOfVowels++;

      }

      else {

        amountOfNonVowels++;

      }
    }

    System.out.println("Amount of Vowels " + amountOfVowels);
    System.out.println("Amount of Non-Vowels " + amountOfNonVowels);

    input.close();
  }
}
