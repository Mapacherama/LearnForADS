package com.Mapacherama;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 3;
        int result = binarySearch(arr, 0, n - 1, x);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }

    public static int binarySearch(int[] arr, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - 1) / 2;

            // If the element is present at the middle itself.
            if (arr[mid] == x) {
                return mid;
            }
            // If element is smaller than mid, then it can only be present in left subarray.
            if (arr[mid] > x) {
                return binarySearch(arr, l, mid - 1, x);
            }
            // else the element can only be present in the right subarray
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
}
