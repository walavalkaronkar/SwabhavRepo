using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using CalculatorLib;

namespace calculatorclient
{
    class Program
    {
        static void Main(string[] args)
        {
            Calculator calculator = new Calculator();
            Console.WriteLine(calculator.cubeOfEvenNumber(2));
            Console.WriteLine(calculator.round(3.61));
            Console.WriteLine(calculator.round(3.21));

        }
    }
}
