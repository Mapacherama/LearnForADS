using System;

namespace Merge_Sort
{
    class Program
    {
        public static int[] mergeSort(int[] array)
        {
            int[] left;
            int[] right;
            int[] result = new int[array.Length];

            // As this is a recursive algorithm, we need to have a base case to
            // Avoid an infinite recursion and therfore a stackoverflow.

            if (array.Length <= 1)
            {
                return array;
            }

            // The exact midpoint of the array
            int midPoint = array.Length / 2;
            // Will represent our 'left' array
            left = new int[midPoint];

            // if the array has an even number of elements, the left and right array will have the same number of
            // elements
            if (array.Length % 2 == 0)
            {
                right = new int[midPoint];
            } else
                right = new int[midPoint + 1];
            // populate left array
            for (int i = 0; i < midPoint; i++)
            {
                left[i] = array[i];
            }
            // populate right array
            int x = 0;
            // We start our index from the midpoint, as we have already populated the left array from 0 to midpoint
            for (int i = midPoint; i < array.Length; i++)
            {
                right[x] = array[i];
                x++;
            }
            // Recursively sort the left array
            left = mergeSort(left);
            // Recursively sort the right array
            right = mergeSort(right);

            result = merge(left, right);
            return result;
        }
        // This method will be responsible for combining our two sorted arrays into one giant array
        public static int[] merge(int[] left, int[] right)
        {
            int resultLength = right.Length + left.Length;
            int[] result = new int[resultLength];
            int indexLeft = 0, indexRight = 0, indexResult = 0;
            // While either array still has an element
            while (indexLeft < left.Length || indexRight < right.Length)
            {
                // if both arrays have elements
                if (indexLeft < left.Length && indexRight < right.Length)
                {
                    //If item on left array is less than item on right array, add that item to the result array 
                    if (left[indexLeft] <= right[indexRight])
                    {
                        result[indexResult] = left[indexLeft];
                        indexLeft++;
                        indexResult++;
                    }
                    else
                    {
                        result[indexResult] = right[indexRight];
                        indexRight++;
                        indexResult++;
                    }
                }
                //if only the left array still has elements, add all its items to the results array
                else if (indexLeft < left.Length)
                {
                    result[indexResult] = left[indexLeft];
                    indexLeft++;
                    indexResult++;
                }
                //if only the right array still has elements, add all its items to the results array
                else if (indexRight < right.Length)
                {
                    result[indexResult] = right[indexRight];
                    indexRight++;
                    indexResult++;
                }
            }
            return result;
        }
        static void Main(string[] args)
        {
            int[] array = { 3, 69, 73, 4, 98, -4, 3, 5, 5, 7 };

            mergeSort(array);
            foreach (var item in array)
            {
                Console.WriteLine(item + " ");
            }
        }
    }
}
