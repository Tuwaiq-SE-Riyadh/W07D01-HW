package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double sum = 0;
        double[][] matrix = new double[3][4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3 by 4 matrix row by row: ");

        for ( int row=0 ; row < matrix.length; row++) {
            for ( int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = input.nextDouble();

            }
        }

        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix[col].length; row++) {
                sum += matrix[col][row];

            }
            System.out.println("Sum of the elements at row " + col + " is: " + sum);
        }

    }
}


