package com.company;

public class sumElements {

    public double[] sum(double [][]array) {
        double sumOfFirstcol = 0;
        double sumOfSecondtcol = 0;
        double sumOfThirdcol = 0;
        double sumOfFourthcol = 0;
        double[] arr =new double[4];

        for (int i = 0; i < array[0].length; i++) {

            for (int j = 0; j < array.length; j++) {
                if(i==0){
                    sumOfFirstcol = sumOfFirstcol +array[j][i];
                }
                if(i==1){
                    sumOfSecondtcol = sumOfSecondtcol +array[j][i];
                }if(i==2){
                    sumOfThirdcol = sumOfThirdcol +array[j][i];
                }if(i==3){
                    sumOfFourthcol = sumOfFourthcol +array[j][i];
                }



            }

        }
      arr= new double[]{sumOfFirstcol, sumOfSecondtcol,sumOfThirdcol,sumOfFourthcol};
        return arr ;
    }
}
