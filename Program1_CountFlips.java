import java.util.Random;
public class Program1_CountFlips {
  public static void main(String[] args) {
    Random random = new Random();

    int heads = 0;
    int tails = 0;
    int max = 100;
    int flipAttempt = 0;

    for(flipAttempt; flipAttempt < 100; flipAttempt++){
      if (random.nextInt(2) == 0){
        heads++;
      } else{
        tails++;
      }
    }
  }
}
