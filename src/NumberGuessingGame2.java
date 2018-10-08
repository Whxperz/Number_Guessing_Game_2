import java.util.Scanner;

public class NumberGuessingGame2 {

    public static void main(String[]args) {

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        //Declare

        int pickedNumber;
        pickedNumber = (int)(Math.random()*100);
        int score = 1000;
        int points = 1;

        //Code
        System.out.println("Pick a number");
        int guess;
        do {
            guess = keyboard.nextInt();
            do { score = score%100;

                if (guess > pickedNumber) {
                    System.out.println("Too high, guess again");
                } else if (guess < pickedNumber) {
                    System.out.println("Too low, guess again");
                } else if (guess == pickedNumber) {
                    System.out.println("Good job! The number is " + guess + "!");
                    System.out.println("Your score is " + score);
                }
            }  while(points<5);
        }  while (guess != pickedNumber);

    }
}


