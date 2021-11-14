package com.company;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter positive number");
        int num = scan.nextInt();
        while(num<=0){
            System.out.println("The number should be positive");
            num = scan.nextInt();
        }
        int f =1;
        for(int i=1; i<= num ; i++)
            f*=i;
        System.out.println("The factorial number is "+f);
    }
}
