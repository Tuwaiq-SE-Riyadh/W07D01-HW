import java.util.Scanner;

public class factorial {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number= scanner.nextInt();
        int Factorial = 1;
        for(int i = 1 ; i <= number ; i++){
            Factorial = Factorial * i;
        }
        System.out.println("Factorial of " + number + " is: " + Factorial);
    }
}
