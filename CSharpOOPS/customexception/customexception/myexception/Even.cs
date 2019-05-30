using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace customexception.myexception
{
    class Even
    {
        private int _number;

        public int Number
        {
            get
            {
                return _number;
            }
            set
            {
                _number = value;
            }
        }

        public bool isEven()
        {
            if(_number % 2 !=0)
            {
                throw new myexception.NotEvenException(" Not a Even Number");
            }
            return true;
        }
    }
}
