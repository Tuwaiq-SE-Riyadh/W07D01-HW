package com.company;

public class Factorial {

    public int isFactorial(int number) {
        if (number < 0) {
            return 0;
        }
        int total = 1;
        int factorial = number;
        for (int i = 1; i <= factorial; i++) {
            total = total * i;
        }

        return total;
    }
}
