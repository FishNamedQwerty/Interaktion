import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void runGame() {
        int computerInput = letComputerChoose();
        int userInput = letUserInput();
        convertToWordUser(userInput);
        convertToWordComputer(computerInput);
        checkResults(computerInput, userInput);
    }

    public static void checkResults(int computerInput, int userInput) {

        if (computerInput == userInput) {
            System.out.println("Draw!");
        } else if (computerInput == 1 && userInput == 2
                || computerInput == 2 && userInput == 3
                || computerInput == 3 && userInput == 1) {
            System.out.println("You win!");

        } else if (computerInput == 2 && userInput == 1
                || computerInput == 3 && userInput == 2
                || computerInput == 1 && userInput == 3) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("Incorrect inputs: round void");
        }
    }

    private static String convertToWordUser(int userInput) {

        String userInputWord = "";

        if (userInput == 1) {
            userInputWord = "Rock";
        } else if (userInput == 2) {
            userInputWord = "Paper";
        } else if (userInput == 3) {
            userInputWord = "Scissors";
        } else {
            userInputWord = "a false option";
        }
        System.out.println("You chose " + userInputWord);
        return userInputWord;
    }

    public static String convertToWordComputer(int computerInput) {
        String computerInputWord = "";

        if (computerInput == 1) {
            computerInputWord = "Rock";
        } else if (computerInput == 2) {
            computerInputWord = "Paper";
        } else if (computerInput == 3) {
            computerInputWord = "Scissors";
        }
        System.out.println("Computer chose " + computerInputWord);
        return computerInputWord;
    }

    public static int letUserInput() {
        int userInput;
        Scanner input = new Scanner (System.in);
        System.out.println("1 for Rock, 2 for Paper, 3 for Scissors: ");
        userInput = input.nextInt();
        return userInput;
    }

    public static int letComputerChoose() {
        Random rgen = new Random();
        int computerInput = rgen.nextInt(1, 3);
        return computerInput;
    }
}
