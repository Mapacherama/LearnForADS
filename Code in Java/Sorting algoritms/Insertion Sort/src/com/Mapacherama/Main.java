package com.Mapacherama;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {9,14,3,2,43,11,58,22};
        System.out.println("Before Insertion Sort");
        for (int i: arr1) {
            System.out.println(i + " ");
        }
        System.out.println();

        insertionSort(arr1);

        System.out.println("After Insertion Sort");

        for (int i: arr1) {
            System.out.println(i + " ");
        }
    }

    public static void insertionSort(int[] array) {
        int n = array.length;

        for (int c = 0; c < n; c++) {
            int key = array[c];
            int i = c-1;
            while((i> -1) && ( array[i] > key)) {
                array [i + 1] = array[i];
                i--;
            }
            array[i+1] = key;
        }
    }
}
