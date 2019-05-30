using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CalculatorLib
{
    public class Calculator
    {
        public Calculator()
        {

        }
        public int round(double number)
        {
            int round=0;
            round = (int)number;
            if(round+0.5 < number)
            {
                round = round + 1;
            }
            
            return round;
            //throw new System.NotImplementedException();
        }

        public double cubeOfEvenNumber(double number)
        {
            double cube=0;
            if(number%2==0)
            {
                cube = number * number * number;
            }
            return cube;
            //throw new System.NotImplementedException();
        }
    }
}
