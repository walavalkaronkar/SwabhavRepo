using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using customattribute;

namespace customattribute
{
    class MyClass
    {
        [NeedForRefractoring()]
        public void add()
        {

        }
        [NeedForRefractoring()]
        public void subtract()
        {

        }
        public void multiply()
        {

        }
    }
}
