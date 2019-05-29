using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace randomguess.guess
{
    class UserGuess
    {
        int number;
        public int guessNumber()
        {
            Console.WriteLine("Enter your guess");
            number=Convert.ToInt32(Console.ReadLine());
            return number;
        }
    }
}
