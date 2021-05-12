using System;

namespace Selection_Sort
{
    class Program
    {
        static void sort(int[] arr)
        {
            int n = arr.Length;

            // One by one move boundary of unsorted subarray
            for (int i = 0; i < n; i++)
            {
                // Find the minimum element in unsorted array
                int min_idx = i;
                for (int c = i + 1; c < n; c++)
                {
                    if (arr[c] < arr[min_idx])
                        min_idx = c;
                }

                // Swap the found minimum element with the first

                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }

        static void printArray(int[] arr)
        {
            int n = arr.Length;
            for (int i = 0; i < n; i++)
            {
                Console.Write(arr[i] + " ");
            }
            Console.WriteLine();
        }
        static void Main(string[] args)
        {
            int[] arr = { 64, 25, 12, 22, 11 };
            sort(arr);
            Console.WriteLine("Sorted array:");
            printArray(arr);

        }
    }
}
