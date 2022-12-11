package day12_MethodCreation.BenimSoruCozumlerim;

import java.util.Random;
import java.util.Scanner;

public class bos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(100);
        System.out.println(randomNumber);
        boolean guess = true;
        int steps = 1;
        while (guess) {
            System.out.println("Guess a number between 0-100: ");
            int guessNumb = scan.nextInt();
            if (guessNumb==randomNumber) {
                guess = false;
            } else if (guessNumb<randomNumber){
                System.out.println("Your guess is smaller than number");
                steps +=1;
            }else if (guessNumb>randomNumber){
                System.out.println("Your guess is bigger than number");
                steps +=1;
            }
        }
        if (steps<=3) System.out.println("Wow, you guessed it quickly");
        else if (steps<=8) {
            System.out.println("Aferin, good job");
        } else {
            System.out.println("Failed guessing game..");
        }

    }
}
