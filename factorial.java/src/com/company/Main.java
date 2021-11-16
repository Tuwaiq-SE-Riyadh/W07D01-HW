
package factorial;

import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int r=input.nextInt();
        int dr=1;
        for(int i=1;i<=r;i++){
            dr*=i;

        }
        System.out.println(dr);
    }

}