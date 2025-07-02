package numberguess.game;
import java.util.Scanner;
public class Number {
    public static void main(String []args){
        // Generate a random number between 0 and 100
        int random = (int) (Math.random() * 101);
        System.out.println("Random number generated (for testing purposes): " + random);
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.print("Please guess the number between 1 and 100 :");
      try( Scanner scanner = new Scanner(System.in)){
          int guess = scanner.nextInt();
        Guess gues = new Guess();
          boolean response = true;
         while (!gues.guess(random, guess)&& response){
            if (gues.getCount() >2) {
                System.out.println("You have exceeded the maximum number of attempts :"+gues.getCount());
                System.out.println("If you want to play again, please enter 'yes', otherwise enter 'no' to exit.");
                response = scanner.next().equalsIgnoreCase("yes");
                gues.setCount(-1);
                gues.setScore(-2);
                gues.setRound(1);
            }
           else{  System.out.print("Please guess again:");
             guess = scanner.nextInt();
           }
         }
         System.out.println("Your score is: " + gues.getScore());
        System.out.println("Thank you for playing!");
     }
    }
}


