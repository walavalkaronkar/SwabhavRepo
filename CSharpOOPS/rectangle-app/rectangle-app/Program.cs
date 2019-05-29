using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using rectangle_app.rectangle;

namespace rectangle_app
{
    class Program
    {
        static void Main(string[] args)
        {
            Rectangle rectangle = new Rectangle(10,20);
            int area= rectangle.calculateArea();
            Console.WriteLine(area);
            Console.ReadKey();


        }
    }
}
