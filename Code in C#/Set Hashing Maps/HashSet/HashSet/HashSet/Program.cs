using System;
using System.Collections.Generic;

namespace HashSet
{
    class Program
    {
        static void Main(string[] args)
        {
            // Creating HashSet
            // Using HashSet class
            HashSet<string> strawHats = new HashSet<string>();

            // Add the elements in HashSet
            // Using Add method
            strawHats.Add("Sanji");
            strawHats.Add("Nami");
            strawHats.Add("Zorro");
            strawHats.Add("Monkey D. Luffy");
            strawHats.Add("Usop");
            strawHats.Add("Brook");
            strawHats.Add("Tony Tony Chopper");

            foreach (string strawHat in strawHats)
            {
                Console.WriteLine("Strawhat member: " + strawHat);
            }

            HashSet<string> myRedHair = new HashSet<string>();

            myRedHair.Add("Shanks");
            myRedHair.Add("Benn Beckman");
            myRedHair.Add("Lucky Roux");
            myRedHair.Add("Yassop");
            myRedHair.Add("Rockstar");
            myRedHair.Add("Dracule Mihawk");

            foreach (string member in myRedHair)
            {
                Console.WriteLine("Red hair pirates member: " + member);
            }

        }
    }
}
