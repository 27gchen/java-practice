package day3;
import java.util.Scanner;

public class PyramidPrinter {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int x = 0;
        System.out.println("how many layers of the pyramid would you like to build?");
        int personNumber = number.nextInt();
        for(x = 0; x < personNumber; x++) {
            for (int z = 0; z < personNumber - x; z++) {
                 System.out.print(" ");
            }
            for (int y = 0; y < x + 1; y++) {
                System.out.print("*");
                }
            System.out.println();
        }
        // int n = 5;
        // for (int i = 0; i < n; i++) {
        //     System.out.print("*");
        // }
        // System.out.println();
    }
}


/*
 * input: 3
 * *
 * **
 * ***
 */