package com.company;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        System.out.print("Enter The Number: ");
        Scanner input =new Scanner(System.in);
        int number = input.nextInt();
        if(number <=0 ) {
            System.out.println("The Number Must be Bigger Than 0");
            System.out.print("Enter The Number Again: ");
             number = input.nextInt();
            System.out.println("The Number is not bigger than 0, Stop The App!");
        }
        int total =number;
        for (int i = number-1;i>0;i--){
            total = total * i;
        }
        System.out.println(total);
    }
}
