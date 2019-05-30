using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace customexception.myexception
{
    class NotEvenException : Exception
    {
        public NotEvenException(String name) : base("Message "+name)
        {

        }
    }
}
