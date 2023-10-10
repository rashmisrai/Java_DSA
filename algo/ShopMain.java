package com.algo;

import java.util.Scanner;

public class ShopMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of users
        System.out.print("Enter the no. of users: ");
        int n = scanner.nextInt();

        // Check for invalid number of users
        if (n <= 0 || n > 1000) {
            System.out.println("Invalid no. of users");
            return;
        }

        int[] creditPoints = new int[n];

        // Input the credit points for each user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the credit points for user " + (i + 1) + ": ");
            creditPoints[i] = scanner.nextInt();
        }

        // Input the number of users to serve (K)
        System.out.print("\nEnter the no. of users to serve: ");
        int k = scanner.nextInt();

        // Check for invalid number of users to serve
        if (k <= 0 || k > n) {
            System.out.println("Invalid no. of users");
            return;
        }

        // Serve K users at a time
        int[] servedUsers = new int[k];
        for (int i = 0; i < k; i++) {
            servedUsers[i] = creditPoints[i];
        }

        // Display unserved users' credit points
        System.out.print("\nThe unserved user's credit points are: ");
        for (int i = k; i < n; i++) {
            System.out.print(creditPoints[i] + " ");
        }

        if (n <= k) {
            System.out.println("\n0 users to serve");
        }
    }
}