package day4;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        double x = Math.sin(Math.PI);
        if (Math.abs(x - 0) < 1E-7) {
            System.err.println("basically 0");
        }
        System.out.println(x);
    }
}
