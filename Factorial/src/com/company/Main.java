package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//Java basics
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if (num > 0) {
            int i = 1, fact = 1;
            while (i <= num) {
                fact = fact * i;
                i++;
            }
            System.out.println("Factorial of the number: " + fact);
        } else
            System.out.println("the number is not positive");
//Arrays
        double[][] matrix = new double[3][4];
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter a 3 by 4 matrix row by row: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = input.nextDouble();
            }
        }
        for (int col = 0; col < matrix[0].length; col++) {
            int colSum = 0;
            for (int row = 0; row < matrix.length; row++) {
                colSum += matrix[row][col];
            }
            System.out.println("Sum of the elements at col " + col + " is: " + colSum);
        }
    }
}