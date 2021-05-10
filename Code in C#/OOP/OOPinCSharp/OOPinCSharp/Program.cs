using System;

namespace OOPinCSharp
{
    class Program
    {
        static void Main(string[] args)
        {
            var account = new BankAccount("Jerôme", 10000);
            Console.WriteLine($"Account {account.Number} was created for" +
                $" {account.Owner} with {account.Balance}.");

            account.MakeWithdrawal(120, DateTime.Now, "One Piece Box Set 2");
            //Console.WriteLine(account.Balance);

            account.MakeWithdrawal(250, DateTime.Now, "Hotel in Barcelona");
            //Console.WriteLine(account.Balance);

            Console.WriteLine(account.getAccountHistory());
            // Test that the initial balances must be positive

            //try
            //{
            //    var invalidAccount = new BankAccount("invalid", -55);
            //} 
            //catch (ArgumentOutOfRangeException e)
            //{
            //    Console.WriteLine("Exception caught creating account with negative balance");
            //    Console.WriteLine(e.ToString());
            //}

            //// Test for a negative balance:
            //try
            //{
            //    account.MakeWithdrawal(750000, DateTime.Now, "Attempt to overdraw");
            //} 
            //catch (InvalidOperationException e)
            //{
            //    Console.WriteLine("Exception caught trying to overdraw");
            //    Console.WriteLine(e.ToString());
            //}
        }
    }
}
