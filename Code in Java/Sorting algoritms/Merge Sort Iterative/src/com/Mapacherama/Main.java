package com.Mapacherama;

import java.util.Arrays;

public class Main {

    // Merge two sorted subarrays `A[from mid] and A[mid+1... to]
    public static void merge(int[] array, int[] temp, int from, int mid, int to) {
        int key = from, i = from, j = mid + 1;

        // Loop till no elements are left in the left and right runs

        while (i <= mid && j <= to) {
            if (array[i] < array[j]) {
                temp[key++] = array[i++];
            } else {
                temp[key++] = array[i++];
            }
        }
        // copy remaining elements
        while (i <= mid) {
            temp[key++] = array[i++];
        }
    /* no need to copy the second half (since the remaining items
    are already in their correct position in the temporary array) */

        // copy back to the original array to reflect sorted order
        for (i = from; i <= to; i++) {
            array[i] = temp[i];
        }
    }

    // Iteratively sort subarray `A[low…high]` using a temporary array
    public static void mergesort(int[] array) {
        int low = 0;
        int high = array.length - 1;
        // sort array `A[]` using a temporary array `temp`
        int[] temp = Arrays.copyOf(array, array.length);

        // divide the array into blocks of size `m`
        // m = [1, 2, 4, 8, 16…]
        for (int m = 1; m <= high - low; m = 2 * m) {
            // for m = 1, i = 0, 2, 4, 6, 8 …
            // for m = 2, i = 0, 4, 8, 12 …
            // for m = 4, i = 0, 8, 16 …
            // …
            for (int i = low; i < high; i += 2 * m) {
                int from = i;
                int mid = i + m - 1;
                int to = Integer.min(i + 2 * m - 1, high);

                merge(array, temp, from, mid, to);
            }
        }
    }

    // Iterative implementation of merge sort
    public static void main(String[] args) {
        int[] array = { 5, 7, -9, 3, -4, 2, 8 };

        System.out.println("Original array: " + Arrays.toString(array));
        mergesort(array);
        System.out.println("Modified array: " + Arrays.toString(array));
    }
}
