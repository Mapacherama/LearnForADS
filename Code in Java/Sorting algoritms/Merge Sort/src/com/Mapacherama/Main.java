package com.Mapacherama;

public class Main {

    public static void main(String[] args) {
        int[] array = {3,95, 38, 16, 32, 18,57};
        int number = array.length;

        mergeSort(array, number);

        for (int i: array
             ) {
            System.out.print(i + " ");

        }
    }

    public static void mergeSort(int[] array, int number){
        if ( number < 2){
            return;
        }

        int mid = number / 2;
        int[] l = new int[mid];
        int[] r = new int[number - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < number ; i++) {
            r[i - mid] = array[i];
        }

        mergeSort(l, mid);
        mergeSort(r, number - mid);

        merge(array, l, r, mid, number - mid);
    }

    public static void merge(int[] array, int[] l, int[] r, int left, int right){
        int i = 0, j = 0, k = 0;
        while (i < left && j < right){
            if(l[i] <= r[j]) {
                array[k++] = l[i++];
            }
            else {
                array[k++] = r[j++];
            }
        }

        while(i < left) {
            array[k++] = l[i++];
        }
        while(j < right) {
            array[k++] = r[j++];
        }
    }
}
