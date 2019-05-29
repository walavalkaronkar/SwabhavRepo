using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using player_app.player;

namespace player_app
{
    class Program
    {
        static void Main(string[] args)
        {
            Player p1 = new Player("Sachin");
            Player p2 = new Player("Virat", 30);
            printDetails(p1);
            printDetails(p2);
            Player elder = p1.whoIsElder(p2);
            Console.WriteLine("Elder is " + elder.Name);
        }

        public static void printDetails(Player p)
        {
            Console.WriteLine(p.Id + " " + p.Name + " " + p.Age);
        }
    }
}

