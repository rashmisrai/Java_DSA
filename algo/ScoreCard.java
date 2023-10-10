package com.algo;

import java.util.Scanner;

public class ScoreCard{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the score card
        System.out.print("Enter the size of the score card: ");
        int cardSize = scanner.nextInt();

        if (cardSize <= 0 || cardSize > 100) {
            System.out.println("Invalid score card size");
            return;
        }

        // Create an array to store the scores
        int[] scores = new int[cardSize];
        int currentIndex = 0; // Index to keep track of the current position in the array

        for (int i = 1; i <= cardSize; i++) {
            System.out.print("Enter the hurdle race score " + i + ": ");
            int score = scanner.nextInt();

            // Add the score to the array
            scores[currentIndex] = score;
            currentIndex = (currentIndex + 1) % cardSize; // Wrap around to the beginning if necessary
        }

        // Output the latest 5 hurdle race scores
        System.out.print("Latest hurdle race scores are: ");
        int start = (currentIndex + cardSize - 5) % cardSize;
        for (int i = 0; i < 5; i++) {
            System.out.print(scores[(start + i) % cardSize] + " ");
        }

        scanner.close();
    }

}


