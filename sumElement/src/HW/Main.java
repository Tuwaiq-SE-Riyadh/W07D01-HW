package HW;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // write your code here
        //        Follow these steps:
        //        Create a new file called sumElements.java
        //        Write a program that returns the sum of all elements in a specified column of a two-dimensional array.
        //                Firstly ask the user to enter a 3-by-4 array The user should
        //                enter the array as follows: 2.6 5.1 6 8 5.4 4.4 7 1 9.5 7.9 2 3
        //        The program should then calculate the sum of each column in the array.

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of row for the array : ");
        int row = scan.nextInt();
        System.out.print("Enter the size of column for the array : ");
        int col = scan.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Enter " + (row * col) + " numbers for array : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        int sum =0;
        System.out.println("The array is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "  ");
                sum += arr[i][j];
            }
            System.out.println();
        }
        System.out.println("The sum is: "+sum);

    }
}
