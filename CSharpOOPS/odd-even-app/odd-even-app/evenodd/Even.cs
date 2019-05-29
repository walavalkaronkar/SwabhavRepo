using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace odd_even_app.evenodd
{
    class Even
    {

        private int _number;

        public Even(int number)
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
