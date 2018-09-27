import java.util.Scanner;

public class NumberGuessingGame2 {

    public static void main(String[]args) {

        Scanner keyboard;
        keyboard = new Scanner(System.in);

<<<<<<< Updated upstream
    }
}
=======
        //Declare

        int pickedNumber;
        String input;
        pickedNumber = (int)(Math.random()*100);

        //Code
        System.out.println("Pick a number");
        int guess;
        do {
            guess = keyboard.nextInt();
            if (guess > pickedNumber) {
                System.out.println("Too high, guess again");
            } else if (guess < pickedNumber) {
                System.out.println("Too low, guess again");
            } else if (guess == pickedNumber) {
                System.out.println("Good job! The number is " + guess + "!");
            }
        }  while (guess != pickedNumber);

        System.out.println("Would you like to play again?");
        while keyboard.nextLine() = "Yes";



    }
}



>>>>>>> Stashed changes
