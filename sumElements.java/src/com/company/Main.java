package com.company;

import java.util.Scanner;

public class Main {


    public static double Task(double [][] arr, int numberColumn){

        double sumColumn = 0;


        for(int i=0; i<arr.length; i++){

            for (int j=0; j<arr[i].length; j++){

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for(int i=0; i<arr.length; i++){

                sumColumn = sumColumn + arr[i][numberColumn];
        }

        return sumColumn;
    }

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);
        double [][] array = new double[3][4];

        for(int i=0; i<array.length; i++){

            for (int j=0; j<array[i].length; j++){

                System.out.println("enter index =>" + i + " " + j);
                array[i][j] = input.nextDouble();
            }
        }
        System.out.println("enter coulom need sum 0 or 1 or 2 or 3");
        int number = input.nextInt();

        System.out.println(Main.Task(array, number));
    }
}
