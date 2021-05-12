using System;

namespace Bubble_Sort
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] a = { 3, 0, 2, 5, -1, 4, 1 };
            int placeholderNumber; // ctrl + r, r is the shortcut to rename variable everywhere.
            Console.WriteLine("Original array :");
            foreach (int i in a)
            {
                Console.Write(i + " ");
            }
            
            Console.WriteLine();

            for (int c = 0; c <= a.Length - 2; c++)
            {
                for (int i = 0; i <= a.Length - 2; i++)
                {
                    if(a[i] > a[i + 1])
                    {
                        placeholderNumber = a[i + 1];
                        a[i + 1] = a[i];
                        a[i] = placeholderNumber;
                    }
                }
            }
            Console.WriteLine("\n" + "Sorted array: ");
            foreach (int i in a)
            {
                Console.Write(i + " ");
            }
            Console.Write("\n");
        }
    }
}
