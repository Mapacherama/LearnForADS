using System;
using System.Collections;

namespace StackLearning
{
    class Program
    {
        static void Main(string[] args)
        {
            Stack myStack = new Stack();
            myStack.Push("Hello There!!");
            myStack.Push(1);
            myStack.Push(2);
            myStack.Push(3);
            myStack.Push(4.5);
            myStack.Push(null);
            myStack.Push("Top of stack");

            Console.WriteLine($"Stack length = {myStack.Count}");

            Console.WriteLine($"The pop of the stack is {myStack.Pop()}");
            myStack.Pop();
            Console.WriteLine($"The peek of the stack is {myStack.Peek()}");

            Console.WriteLine($"Stack length after removal = {myStack.Count}");
            myStack.Clear();
            Console.WriteLine($"mystack has a 2 => {myStack.Contains(2)}");

            foreach (var stackItem in myStack)
            {
                Console.WriteLine(stackItem);
            }
        }
    }
}
