using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using randomguess.guess;

namespace randomguess

{
    class Program
    {
        static void Main(string[] args)
        {
            //UserGuess userGuess = new UserGuess();
            bool guess = false;
            int userGuess;
            Random random = new Random();

            int randomNumber = (int)random.Next(100);
            Console.WriteLine("randomNumber" + randomNumber);
            UserGuess user = new UserGuess();
            while (guess == false)
            {
                userGuess = user.guessNumber();
                if (userGuess == randomNumber)
                {
                    Console.WriteLine("Matched");
                    guess = true;
                    return;
                }
                if (userGuess > randomNumber)
                {
                    Console.WriteLine("High");
                }
                else
                {
                    Console.WriteLine("Low");
                }
            }
        }
    }
}
