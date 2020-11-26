/*
* This Program runs a dice game where you guess a random number from a set of 
* numbers that you choose
*
* @author  Douglass Jeffrey
* @version 1.0
* @since   2020-11-25
* Class DiceGame.
*/

import java.util.Scanner; // Import the Scanner class

public class DiceGame {

  /**
   * This class runs a dice game where you guess a random number from a set of 
   * numbers that you choose.
   */

  public static void main(String[] args) {
    
    // Defines guess counter
    int guesses = 0;

    // Begins try statement
    try {
      // Create a Scanner object
      Scanner scan = new Scanner(System.in);

      // Explains game to user
      System.out.println("This is the Dicegame program. You play by first "
                         + "entering the number of sides you wish the die "
                         + "to have, and then guessing numbers that would be "
                         + "located on the die until you get the right answer");

      // Accepts user input
      System.out.println("Enter number of sides: ");
      // Read int input 
      int numberofsides = scan.nextInt();

      // Checks to see if a realistic number of sides has been chosen
      if (numberofsides < 1) {
        System.out.println("Invalid number of sides please pick real numbers.");
        return;
        
      // If a proper integer has been chosen:
      } else {

        // Generates random number
        int randomint = (int) (Math.random() * (numberofsides - 1 + 1) + 1);

        // Displays random integer (for debugging) usually commented out
        //System.out.println(randomint);
        
        // Beginning of guessing loop
        while (true) {

          // Recieves user input
          System.out.println();
          System.out.println("guess a number between 1 and " + numberofsides);
          int guessednum = scan.nextInt();

          // Counts and prints amount of guesses
          guesses = guesses + 1;
          System.out.println("Guesses: " + guesses);

          // Determines if guessed number is equivalent to random number
          if (guessednum == randomint) {
            System.out.println();
            System.out.println("You guessed correctly! The answer was: " 
                               + randomint + ". it took you: " + guesses
                               + " guesses");
            break; // Ends loop if user guesses correctly
          } else {
            System.out.println();
            System.out.println("Wrong guess. Try again.");
          }
        }
      }
    // Catches invalid inputs
    } catch (Exception e) {
      System.out.println();
      System.out.println();
      System.out.println("Invalid input. Please try again");
    }
  }
}
