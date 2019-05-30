using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace accountchange
{
    class Program
    {
        static void Main(string[] args)
        {
            Account account = new Account("Onkar");
            LogClass logs = new LogClass(account);
            Log log = logs.Logs;
            double amount;

            amount = 5000;
            string sucess = logs.deposit(amount);
            Console.WriteLine(sucess);
            Console.WriteLine("Transactons-");

            List<String> loglist = log.getList();
            printLog(loglist);

            amount = 2000;
            sucess =logs.withdraw(amount);
            Console.WriteLine(sucess);
            Console.WriteLine("Transactons-");


            loglist = log.getList();
            printLog(loglist);

        }

        private static void printLog(List<String> loglist)
        {
            foreach (String s in loglist)
            {
                Console.WriteLine(s);
            }
        }
    }
}
