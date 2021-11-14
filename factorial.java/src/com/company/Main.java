package com.company;

import java.util.Scanner;

public class Main {

    public static void Task(){

        int InputNumber = 0 ;
        int i ;
        int fact = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter positive integer number");
        InputNumber = input.nextInt();

        for(i=1;i<=InputNumber;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+InputNumber+" is: "+fact);
    }

    public static void main(String[] args) {
        // write your code here


        Main.Task();
    }
}


