package com.TheCodingCoon;

import java.util.Scanner;

public class BubbleSortExample {
    public void bubbleSort(int[] arr){
        int n, c, d, swap;

        Scanner input = new Scanner(System.in);

        System.out.println("Input amount of numbers to sort:");
        n = input.nextInt();

        int[] array = new int[n];

        System.out.println("Enter " + n + " amount of numbers:");

        for (c = 0; c < n; c++)
            array[c] = input.nextInt();

        for (c = 0; c < (n - 1); c++) {
            for (d = 0; d < n - c - 1; d++) {
                if(array[d] > array[d+1]) {
                    swap = array[d];
                    array[d] = array[d + 1];
                    array[d + 1] = swap;
                }
            }
        }

        System.out.println("Sorted list of numbers:");

        for (c = 0; c < n; c++) {
            System.out.println(array[c]);
        }

    }
}
