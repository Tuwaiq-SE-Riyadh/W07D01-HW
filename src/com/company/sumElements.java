package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class sumElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int twoDimensionalArray [][] = new int [3][4];
//        System.out.println(twoDimensionalArray[2].length);

        for(int i = 0 ; i <twoDimensionalArray.length ; i++ )
        {
            for (int j = 0 ; j <twoDimensionalArray[i].length ; j++)
            {
                System.out.print("i="+ i + "j="+j +" :");
                twoDimensionalArray[i][j]= sc.nextInt();
            }
        }
        calculateTheSumOfEachColumn(twoDimensionalArray);


    }


    public static void  calculateTheSumOfEachColumn (int twoDiArray [][])
    {
        int sum = 0 ;
        for(int i = 0 ; i <twoDiArray.length ; i++ ){

            for (int j = 0 ; j <twoDiArray[i].length ; j++)
            {
                sum = sum + twoDiArray[i][j];
            }
            System.out.println("The sum of line "+i +" is equal =" +sum);
            sum = 0;
        }
    }

}
