package com.company;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ;
        System.out.println("Enter number to calculate factorial : ");
        int num =input.nextInt();
        int total =1 ;
        if (num!=0){
        for (int i = 1; i <= num; i++) {
            total =total * i ;
        }
        System.out.println("factorial "+num+"! = "+total);}
        else{
            System.out.println("the number is zero ");
        }
    }
}
