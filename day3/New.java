package day3;
import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner poop = new Scanner(System.in);
        int i = 0;
        System.out.println("How many lines would you like to print?");
        int answerNumber = poop.nextInt();
        for(i = 0; i < answerNumber; i++) {
            for(int x = 0; x < answerNumber - i -1; x++){
                System.out.print(" ");
            }
            for(int y = 0; y < 2 * i + 1; y++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i = 0; i < answerNumber - 1; i++) {
            for(int z = 0; z < i +1; z++){
                System.out.print(" ");
            }
            for(int t = 0; t < 2 * answerNumber - 3 - 2 * i; t++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
