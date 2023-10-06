package com.java;

public class ReverseOfNumber {
    public static void main(String[] args) {
        int n = 23597;
        int ans = 0;
        //qn: Write a code to print the reverse of number i.e. 79532

        while (n > 0) {
            int rem = n % 10;
            n = n/10;

            ans = ans * 10 + rem;

        }
        System.out.println(ans);
    }
}
