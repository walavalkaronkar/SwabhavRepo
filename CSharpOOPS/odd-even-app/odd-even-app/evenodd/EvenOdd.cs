using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace odd_even_app.evenodd
{
    class EvenOdd
    {
        private static int oddIndex;
        private static int evenIndex;
        private int maxValue;
        public EvenOdd()
        {
            maxValue = 10;
        }

        public void setMaxValue(int maxValue)
        {
            this.maxValue = maxValue;
        }

        public Odd[] giveOddNumber()
        {
            Odd[] odd = new Odd[maxValue / 2 + 1];
            for (int index = 0; index <= maxValue; index++)
            {
                if (index % 2 != 0)
                {
                    odd[oddIndex] = new Odd(index);
                    oddIndex++;
                }
            }
            return odd;
        }

        public void printOddNumber(Odd[] odd)
        {
            Console.WriteLine("\nOdd Numbers");
            for (int index = 0; index < oddIndex; index++)
            {
                int number = odd[index].Number;
                Console.Write(number + " ");
            }
        }

        public Even[] giveEvenNumber()
        {
            Even[] even = new Even[maxValue / 2 + 1];
            for (int index = 0; index <= maxValue; index++)
            {
                if (index % 2 == 0)
                {
                    even[evenIndex] = new Even(index);
                    evenIndex++;
                }
            }
            return even;
        }

        public void printEvenNumber(Even[] even)
        {
            Console.WriteLine("\nEven Numbers");
            for (int index = 0; index < evenIndex; index++)
            {
                int number = even[index].Number;
                Console.Write(number + " ");
            }
        }
    }
}
