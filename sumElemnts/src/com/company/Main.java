package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter number");
        int[][] array = new int[3][4];
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){

                Scanner input=new Scanner(System.in);
                int userInput=input.nextInt();
                array[i][j]=userInput;
            }
        }

        System.out.println("The array is :");
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

        int sumColumn0=0;
        for (int i=0;i<3;i++){
            sumColumn0+=array[i][0];
        }

        int sumColumn1=0;
        for (int i=0;i<3;i++){
            sumColumn1+=array[i][1];
        }

        int sumColumn2=0;
        for (int i=0;i<3;i++){
            sumColumn2+=array[i][2];
        }

        int sumColumn3=0;
        for (int i=0;i<3;i++){
            sumColumn3+=array[i][3];
        }

        System.out.println("The sum of column1 "+sumColumn0);
        System.out.println("The sum of column2 "+sumColumn1);
        System.out.println("The sum of column3 "+sumColumn2);
        System.out.println("The sum of column4 "+sumColumn3);


    }
}
