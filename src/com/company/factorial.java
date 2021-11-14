package com.company;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Positive Number:");
        int userInput = sc.nextInt();
        int factorialResult = userInput;

        for (int i = userInput-1 ; i > 0 ;i--)
        {
            factorialResult  = factorialResult * i;
        }
        System.out.println("factorialResult:" + factorialResult);
    }
}
