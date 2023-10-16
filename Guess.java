//Number Guessing game in Java
//Initialize a random number from the user
//Ask the user to guess the number, if !True, Ask user to guess again



import java.util.Scanner;
public class Guess {
    public static void main(String[]args){

        int SecretNum;
        int guess;
        boolean correct = false;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a secret number: ");
        SecretNum = keyboard.nextInt();

        while (!correct) {

            System.out.println("Guess a number: ");
            guess = keyboard.nextInt();

            if(guess == SecretNum) {
                correct = true;
                System.out.println("You are right");
            }
            else if(guess < SecretNum) {
                System.out.println("Guess a Higher Number");
            }
            else if ( guess > SecretNum) {
                System.out.println("Guess Lower");
            }

        }

    }
    
}
