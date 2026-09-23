import java.util.Random;
public class Program1_CountFlips {
  public static void main(String[] args) {
    Random random = new Random();

    int headsCount = 0;
    int tailsCount = 0;
    int flipAttempt;

    for(flipAttempt = 0; flipAttempt < 100; flipAttempt++){
      if (random.nextInt(2) == 0){
        headsCount++;
      } else{
        tailsCount++;
      }
    }

    System.out.println("Heads: " + headsCount);
    System.out.println("Tails: " + tailsCount);
  }
}
