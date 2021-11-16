package sumelement;

import java.util.Scanner;

public class SumElement {

    static double[][] mat;


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of rows ");

        int r=input.nextInt();
        System.out.println("number of columns");
        int c=input.nextInt();
        mat=new double[r][c];
        System.out.println("Please enter elements of matrix");

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=input.nextDouble();
            }
        }
        int i, j;

        System.out.print(
                "\nFinding Sum of each column:\n\n");


        for (i = 0; i <r; ++i) {
            double sum = 0;

            for (j = 0; j <c; ++j) {


                sum = sum + mat[j][i];
            }


            System.out.println("Sum of the column " + i
                    + " = " + sum);



        }




    }
}