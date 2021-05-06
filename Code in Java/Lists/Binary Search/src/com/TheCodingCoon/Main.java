package com.TheCodingCoon;

public class Main {

    public static void main(String[] args) {
        BinarySearchExample binarySearchExample = new BinarySearchExample();
        int[] arr = {10,20,30,40,50};
        int key = 30;

        int last = arr.length - 1;

        binarySearchExample.binarySearch(arr, 0, last, key);
    }
}
