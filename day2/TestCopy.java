package day2;
import java.util.Scanner;

public class TestCopy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("how many times would you like to play?");
        int userNumber = in.nextInt();
        // double x = Math.random();
        int userScore = 0;
        int computerScore = 0;
        int i = 0;
        for (; i < userNumber; i++) {
            System.out.println("please enter ur move");
            String userMove = in.next();
            double x = Math.random();
            String computerChoice;
            if (x < 0.33) {
                computerChoice = "rock";
            } else if (x < 0.66) {
                computerChoice = "paper";
            } else {
                computerChoice = "scissors";
            }
            System.out.println("computer chooses: " + computerChoice);
            if(userMove.equals(computerChoice)) {
                System.out.println("It's a tie!");
            }
            else if(userMove.equals("paper") && computerChoice.equals("rock") 
                    || userMove.equals("scissors") && computerChoice.equals("paper") 
                    || userMove.equals("rock") && computerChoice.equals("scissors")) {
                System.out.println("you win!");
                userScore++;
                
            }
            else if (userMove.equals("paper") && computerChoice.equals("scissors") 
                    || userMove.equals("scissors") && computerChoice.equals("rock") 
                    || userMove.equals("rock") && computerChoice.equals("paper")) {
                System.out.println("you lose");
                computerScore++;
                
            } else {
                System.out.println("please enter rock paper or scissors");
                continue;
            }
            System.out.println("user wins is now " + userScore);
            System.out.println("computer wins is now " + computerScore);
        }
        
    }
}
