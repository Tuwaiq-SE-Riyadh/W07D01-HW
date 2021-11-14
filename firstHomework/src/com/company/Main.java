package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Factorial obj = new Factorial();
        sumElements obj2 = new sumElements();

        double[][] array = new double[3][4];
        array[0][0] = 2.6;array[0][1] = 5.1;array[0][2] = 6;array[0][3] = 8;
        array[1][0] = 5.4;array[1][1] = 4.4;array[1][2] = 7;array[1][3] = 1;
        array[2][0] = 9.5;array[2][1] = 7.9;array[2][2] = 2;array[2][3] = 3;
        double[] test = obj2.sum(array);

        System.out.println("The sum for each column: "+ Arrays.toString(test));


        //First task
        int number;
        do {
            System.out.println("Enter Positive Number to calculate its factorial");
            number = input.nextInt();
        } while (number < 0);
        int fac = obj.isFactorial(number);
        System.out.println("Factorial of " + number + "is " + fac);

    }
}
