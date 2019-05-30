using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using customexception.myexception;

namespace customexception
{
    class Program
    {
        static void Main(string[] args)
        {
            Even even = new Even();
            even.Number = 3;
            try
            {
                even.isEven();
            }
            catch(Exception e)
            {
                Console.WriteLine(e.Message);
            }
        }
    }
}
