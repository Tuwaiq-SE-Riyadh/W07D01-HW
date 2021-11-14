import java.util.Scanner;

class SumElements{
    public static void main(String[] args){
        int[][] arr =new int[3][4];
        Scanner input = new Scanner(System.in);

        for (int i=0;i<arr.length;i++){
            System.out.println("Enter Four Numbers for row Number "+(i+1)+":" );
            for (int j=0;j<arr[i].length;j++){
                arr[i][j] = input.nextInt();
            }
        }
        for (int i=0 ;i<=arr.length;i++){
            int total=0;
            for (int j=0;j<arr.length;j++){
                total = total+arr[j][i];
            }
            System.out.println("The total of column Number "+(i)+": "+total);
        }
    }

}