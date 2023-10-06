package com.java;

public class DigitCount {
    public static void main(String[] args) {
        int n = 1385757879;
        int count = 0;

        /* find out how many times number 7 is repeating . Answer  should be 3  */
        while (n > 0) {
            int rem = n % 10;
            if (rem == 7) {
                count++;
            }
            n = n / 10;
        }
        System.out.print("The number 7 is repeated " + count + " times");



    }
}
