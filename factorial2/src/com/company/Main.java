package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int factorial=1;
        System.out.println("Enter");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();

        for (int i=1;i<=n;i++) {
            factorial=factorial*i;

        }
        System.out.println("The factorial of  "+n+" is :" +factorial);
        }
    }

