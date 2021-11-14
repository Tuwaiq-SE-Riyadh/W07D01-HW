package arrayHW;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int factorial = 1;
		System.out.println("Please Enter positive integer: ");
		int userInput = scanner.nextInt();
		
		for(int i=1; i <= userInput; i++){    
			factorial = factorial * i;    
		  }
		System.out.println("Factorial of " + userInput + " = " + factorial); 
	}

}
