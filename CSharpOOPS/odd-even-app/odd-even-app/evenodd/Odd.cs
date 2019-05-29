using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace odd_even_app.evenodd
{
    class Odd
    {
        private int _number;

        public Odd(int number)
        {
            _number = number;
        }

        public int Number
        {
            get
            {
                return _number;
            }
        }
    }
}
