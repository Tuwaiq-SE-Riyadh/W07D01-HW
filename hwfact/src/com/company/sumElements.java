package com.company;
import java.util.*;
 class Sum{

    static double[][] mat;

    public static void main(String[] args) {
        double sum = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows and number of columns");

        int n = input.nextInt();
        int m = input.nextInt();
        mat = new double[n][m];
        System.out.println("Please enter elements of matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = input.nextDouble();
            }
        }

        for (int j = 0; j < m; j++) {
            sum = 0;
            for (int i = 0; i < n; i++) {

                sum += mat[i][j];
            }

            System.out.println("sum of elements of " + sum);

        }


        System.out.println("enter col");
        int col = input.nextInt();
        sum = 0;
        for (int i = 0; i < n; i++) {

            sum += mat[i][col];

        }
        System.out.println("sum of elements of " + col + "in the mat is " + sum);


    }
}