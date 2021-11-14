package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int factorial = 1;
        System.out.println("Enter positive integer: ");
        int number = in.nextInt();

        for(int i = 1 ; i <= number ; i++){
            factorial = factorial * i;
        }
        System.out.printf("Factorial of %d = %d\n", number, factorial);
    }
}
