using System;

namespace BinarySearch
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] Arr = { 5, 6, 7, 8, 9, 17 };

            Console.WriteLine("Iteratively Found element at index: {0}", IterativeBinarySearch(Arr, 8, 0, Arr.Length - 1));

        }
        public static int? IterativeBinarySearch(int[] ArrayList, int key, int low, int high)
        {
            int mid = 0;
            do
            {
                mid = (low + high) / 2;
                if (key == ArrayList[mid])
                {
                    return mid;
                }
                else if (key < ArrayList[mid])
                {
                    high = mid - 1;
                } // Search the first half.
                else
                {
                    low = mid + 1;
                    // Search the second half.
                }
            } while (low <= high);

            return null;
        }

    }

    
}
