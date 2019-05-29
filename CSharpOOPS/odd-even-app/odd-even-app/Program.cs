using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using odd_even_app.evenodd;

namespace odd_even_app
{
    class Program
    {
        static void Main(string[] args)
        {
            int maxValue = 100;
            EvenOdd oddeven = new EvenOdd();
            oddeven.setMaxValue(20);
            Even[] even = oddeven.giveEvenNumber();
            oddeven.printEvenNumber(even);

            Odd[] odd = oddeven.giveOddNumber();
            oddeven.printOddNumber(odd);
        }
    }
}
