package com.company;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int temp = -1;
        while (temp < 0){
            System.out.println("Enter positive integer:");
            temp = in.nextInt();
        }

        for(int i = temp-1 ; i > 0 ; i--){
            temp *= i;
        }
        System.out.println("Factorial ="+temp);
    }
    }
