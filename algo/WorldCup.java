package com.algo;

import java.util.Scanner;

public class WorldCup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of teams
        System.out.print("Enter the number of Teams: ");
        int size = scanner.nextInt();

        int[] scores = new int[size];

        // Input the scores in sorted order
        System.out.println("Enter the scores:");
        for (int i = 0; i < size; i++) {
            scores[i] = scanner.nextInt();
        }

        // Input the score to be searched
        System.out.print("Enter the score to be searched: ");
        int key = scanner.nextInt();

        // Perform binary search to find the team with the given score
        int result = binarySearch(scores, size, key);

        if (result != -1) {
            System.out.println(key + " is the score of Team " + (result + 1));
        } else {
            System.out.println("Score Not Found");
        }

        scanner.close();
    }

    public static int binarySearch(int[] ar, int size, int key) {
        int left = 0;
        int right = size - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (ar[mid] == key) {
                return mid;
            }

            if (ar[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Score not found
    }
}

