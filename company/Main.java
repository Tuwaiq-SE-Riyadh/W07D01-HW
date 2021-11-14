package com.company;
import java.util.Scanner;

public class Main {



        public static void main(String args[]){
            int i,factorial=1;
            int numberUser;
            Scanner myScan = new Scanner(System.in);
            System.out.print( "\nPlease enter positive integer : " );
            numberUser = myScan.nextInt();


            for(i=1;i<=numberUser;i++)
                factorial=factorial*i;

            System.out.println("Factorial of "+numberUser+" is: "+factorial);
        }
    }



