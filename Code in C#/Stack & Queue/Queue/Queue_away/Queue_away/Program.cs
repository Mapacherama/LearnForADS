using System;
using System.Collections;

namespace Queue_away
{
    class Program
    {
        static void Main(string[] args)
        {
            // Creating a Queue 
            Queue myQueue = new Queue();

            // Inserting the elements into the Queue.
            myQueue.Enqueue("One");

            // Displaying the count of elements
            // contained in the Queue
            Console.Write("Total number of elements in the Queue are: ");

            Console.WriteLine(myQueue.Count);

            myQueue.Enqueue("two");

            // Displaying the count of elements
            // contained in the Queue
            Console.Write("Total number of elements in the Queue are: ");

            Console.WriteLine(myQueue.Count);

            myQueue.Enqueue("three");

            // Displaying the count of elements
            // contained in the Queue
            Console.Write("Total number of elements in the Queue are: ");

            Console.WriteLine(myQueue.Count);

            myQueue.Enqueue("four");

            // Displaying the count of elements
            // contained in the Queue
            Console.Write("Total number of elements in the Queue are : ");

            Console.WriteLine(myQueue.Count);

            myQueue.Enqueue("five");

            // Displaying the count of elements
            // contained in the Queue
            Console.Write("Total number of elements in the Queue are : ");

            Console.WriteLine(myQueue.Count);

            myQueue.Enqueue("six");

            // Displaying the count of elements
            // contained in the Queue
            Console.Write("Total number of elements in the Queue are : ");

            Console.WriteLine(myQueue.Count);

        }
    }
}
