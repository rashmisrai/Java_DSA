package com.algo;

import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of an array: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Invalid array size");
            scanner.close();
            return;
        }

        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }


        // Perform Merge Sort
        mergeSort(arr, 0, size - 1);

        // Print sorted array
        System.out.println("Sorted array is");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            // Sort the left and right halves
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            // Merge the sorted halves
            merge(arr, l, mid, r);
        }
    }

    public static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        // Create temporary arrays
        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy data to temp arrays left[] and right[]
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }

        // Merge the temp arrays back into arr[l..r]
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of left[], if any
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy the remaining elements of right[], if any
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}