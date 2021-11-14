package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double[][] matrix;

            Scanner input = new Scanner(System.in);
            System.out.println("Enter number of rows and columns: ");

            int row = input.nextInt();
            int col = input.nextInt();
            matrix = new double[row][col];
            System.out.println("Enter elements of matrix: ");

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    matrix[i][j] = input.nextDouble();
                }
            }

            System.out.println("Enter column number: ");
            double sum = 0D;
            int column = input.nextInt();
            for (int i = 0; i < col; i++) {
                sum += matrix[i][column];
            }

            System.out.println("sum of elements " + column + " in the matrix is " + sum);
        }
    }

