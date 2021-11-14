package HW1;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        System.out.print("Please enter positive integer: ");
        int num=read.nextInt();
int factorial=1;
        while (num<0){
            System.out.print("Please enter positive integer: ");
             num=read.nextInt();
        }

        for (int i=0;i<num;i++){
            factorial+=factorial*i;
        }

        System.out.println("Factorial of "+num+" is: "+factorial);
    }
}

