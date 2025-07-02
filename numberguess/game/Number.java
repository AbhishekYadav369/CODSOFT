package numberguess.game;
import java.util.Scanner;
public class Number {
    static Guess  gues = new Guess();
   private static int generateGuessNumber(Scanner scanner) {
        System.out.print("Please guess the number between 1 and 100 :");
        return scanner.nextInt();
    }
    public static void main(String []args){
        // Generate a random number between 0 and 100
        int random = (int) (Math.random() * 101);
        System.out.println("Welcome to the Number Guessing Game!");
       try( Scanner scanner = new Scanner(System.in)){
          int guess ;
          boolean response = true;
          boolean guessed = false;
         while (!guessed&& response){
            if (gues.getCount() >2) {
                System.out.println("You have exceeded the maximum number of attempts :"+gues.getCount());
                System.out.println("If you want to play again, please enter 'yes', otherwise enter 'no' to exit.");
                response = scanner.next().equalsIgnoreCase("yes");
                gues.setCount(0);
                gues.setScore(-2);
                gues.setRound(1);
            }
           else {  guess= generateGuessNumber(scanner);
             guessed=gues.guess(random, guess);
           }
         }
         System.out.println("Your score is: " + gues.getScore());
        System.out.println("Thank you for playing!");
     }
    }
}


