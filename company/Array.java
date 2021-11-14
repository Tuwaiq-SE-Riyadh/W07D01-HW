package com.company;
import java.util.Scanner;
public class Array{



    public static void main(String args[]){
        double[][] array = getArray();

        for (int column = 0; column < array[0].length; column++) {
            System.out.println(
                    "Sum of the elements at column " + column +
                            " is " + sumColumns(array, column));
        }
    }
    public static double[][] getArray() {
        Scanner input = new Scanner(System.in);
         int rows = 3;
         int columns = 4;
        double[][] mult = new double[rows][columns];
        System.out.println(" please Enter a " + rows + " rows-by-" +
                columns+ " columns :");
        for (int row = 0; row < mult.length; row++)
            for (int column = 0; column < mult[row].length; column++)
                mult[row][column] = input.nextDouble();
        return mult;
    }


    public static double sumColumns(double[][] i, int columnIndex) {
        double sum = 0;
        for (int row = 0; row < i.length; row++) {
            sum =sum+i[row][columnIndex];
        }
        return sum;
    }
}