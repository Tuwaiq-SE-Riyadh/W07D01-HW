import java.util.Scanner;

public class sumElements {

    public static void main(String[] args){
        double[][] array = new double[3][4] ;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Numbers: ");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[0].length; column++) {
                array[row][column] = scanner.nextDouble();
            }
        }

        for (int column = 0; column < array[0].length; column++) {
            int result = 0;
            for (int row = 0; row < array.length; row++) {
                result += array[row][column];
            }
            System.out.println("Total column " + column + " is: " + result);
        }
    }
}

