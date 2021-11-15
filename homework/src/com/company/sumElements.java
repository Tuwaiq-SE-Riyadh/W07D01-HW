package com.company;

import java.util.Scanner;

public class sumElements {
    public static void main(String[] args) {
        double [][] matrix= new double [3][4] ;
        double sum =0D;
        Scanner input = new Scanner (System.in);

        System.out.println("pleases full matrix  3 x 4 : ");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = input.nextDouble();

            }
        }
        System.out.println("pleases chose the column to sum it ");
        int column= input.nextInt();
        for (int i = 0; i < 3; i++) {
            sum+=matrix[i][column];
        }
        System.out.println("Sum values in "+column+ " is "+sum);

    }
}
