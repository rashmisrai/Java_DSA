package com.java;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {

        // Check whether the character is UPPERCASE or LOWERCASE

        System.out.print("Take the character input: ");
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if (ch >='a' && ch<='z'){
            System.out.print("This is Lowercase");
        }
        else {
            System.out.print("This is Uppercase");
        }
    }
}
