package HW1;
import java.util.*;
public class sumElements {
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        double sum = 0, sum2 = 0,sum3=0,sum4=0;
        double[][] a =new double[3][4];

        System.out.println("Enter array");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++)
            a[i][j]=read.nextDouble();
            System.out.println("Next Row");
        }

        for (int i = 0; i <4; i++) {
            for(int j=0;j<3;j++)
                sum += a[j][i];
            System.out.println("sum column " +(i+1)+": "+sum);
            sum=0;
        }


    }
}
