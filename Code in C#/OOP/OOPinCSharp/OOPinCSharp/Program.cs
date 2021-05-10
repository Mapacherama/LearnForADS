using System;

namespace OOPinCSharp
{
    class Program
    {
        static void Main(string[] args)
        {
            var account = new BankAccount("Jerôme", 2000000);
            Console.WriteLine($"Account {account.Number} was created for" +
                $" {account.Owner} with {account.Balance}.");
        }
    }
}
