package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class sumElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 3x4 numbers");
        int arr[][]= new int[3][4];
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                int num = scan.nextInt();
                arr[i][j]=num;
            }
        }

        for (int i = 0; i <arr.length ; i++) {
                count1 += arr[i][0];
                count2 += arr[i][1];
                count3 += arr[i][2];
                count4 += arr[i][3];
        }

        System.out.println("the array 1 row "+ Arrays.toString(arr[0]));
        System.out.println("the array 2 row "+ Arrays.toString(arr[1]));
        System.out.println("the array 3 row "+ Arrays.toString(arr[2]));
        System.out.println("the total of 1 column "+count1);
        System.out.println("the total of 2 column "+count2);
        System.out.println("the total of 3 column "+count3);
        System.out.println("the total of 4 column "+count4);
    }
}
