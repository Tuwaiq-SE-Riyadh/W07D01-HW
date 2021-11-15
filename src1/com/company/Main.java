package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number ");
        int number = scanner.nextInt();
        int sum=1;
        for (int i=1;i<= number;i++) {
            sum = i * sum;
        }
        System.out.println(sum);
        }
    }

