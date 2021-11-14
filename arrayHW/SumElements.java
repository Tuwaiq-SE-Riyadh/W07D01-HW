package arrayHW;

import java.util.Scanner;

public class SumElements {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int column1 = 0, column2 = 0, column3 = 0;
		int[][] array = new int[3][4];
		
		for(int i=0 ; i<array.length; i++){
			for(int j=0; j<array[i].length; j++){
				System.out.println("Enter column " + (j+1) + " in row " + (i+1) + ": ");
				array[i][j] = scanner.nextInt();
				if(i == 0){
					column1 += array[i][j];
				}
				else if(i == 1){
					column2 += array[i][j];
				}
				else {
					column3 += array[i][j];
				}
			}
		}
		System.out.println("Sum of column1 = " + column1);
		System.out.println("Sum of column2 = " + column2);
		System.out.println("Sum of column3 = " + column3);		
	}
}
