package com.company;
import java.sql.SQLOutput;
import java.util.*;
 class Fact{

    public static void main(String[] args) {
        // write your code here
        Scanner in =new Scanner (System.in);
        System.out.println("enter number");

        int num =in .nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
           fact=fact*i;
        }
        System.out.println("factorial"+fact);

    }
}
