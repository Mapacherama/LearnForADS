using System;
using System.Collections.Generic;

namespace anotherQueueExample
{
    class Program
    {
        static void Main(string[] args)
        {
            // Creating a Queue
            Queue<string> myQueue = new Queue<string>();
            myQueue.Enqueue("Pell");
            myQueue.Enqueue("Rocks D. Xebec");
            myQueue.Enqueue("Sanji");
            myQueue.Enqueue("Trafalgar D. Water Law");
            myQueue.Enqueue("Usopp");

            foreach (string i in myQueue)
            {
                Console.WriteLine(i + " ");
            }

            Console.WriteLine("The element Pell is contained in the queue:" + myQueue.Contains("Pell"));
            Console.WriteLine("The element Roger is contain in the queue:" + myQueue.Contains("Roger"));
            Console.WriteLine("The element Zorro is contain in the queue:" + myQueue.Contains("Zorro"));

            Console.WriteLine("Peek the first item from the queue is:" + myQueue.Peek());
            // Removes and returns the object at the beginning of the Queue<T>. For example:
            myQueue.Dequeue();
            Console.WriteLine("Peek the first item from the queue is:" + myQueue.Peek());

            myQueue.Clear();

            Console.WriteLine("The elements in the queue are after the clear method:" + myQueue.Count);
        }
    }
}
