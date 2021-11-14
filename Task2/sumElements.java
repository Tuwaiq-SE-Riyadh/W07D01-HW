package com.company;

import java.util.Scanner;

public class sumElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double arr [][] = new double[3][4];

        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                System.out.println("Enter number in arr["+j+"]["+i+"]");
                arr[j][i] = in.nextInt();
            }}

        for(int i = 0 ; i < 4 ; i++){
            int sum = 0;
            for(int j = 0 ; j < 3 ; j++){
                sum += arr[j][i];

            }
            System.out.println("Sum of column ["+i+"]= "+sum);}
    }
}
