package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class sumElements {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int[][] a = new int[3][4];
        System.out.println("Enter The Numbers of 3-by-4 array:");
        for(int i=0; i<a.length; i++){

            for (int j = 0 ;j<4;j++){
                a[i][j]=input.nextInt();

            }
            if(i != 2){
                System.out.println(" Next Row ");
            }

        }
        int total = 0;
        for(int i=0; i<4; i++){

            for (int j = 0 ;j<3;j++){

                total = total + a[j][i];


            }
            int x = i+1;
            System.out.println("total of colume number "+x+" : "+total);
            total=0;
            //total = total+ a[i][]

        }
    }
}
