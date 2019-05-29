using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using rectangleencapsulation.rectangle;

namespace rectangleencapsulation
{
    class Program
    {
        static void Main(string[] args)
        {
            Rectangle rectangle = new Rectangle();
            rectangle.Width = 10;
            rectangle.Height = 20;
            rectangle.BgColor=Rectangle._bgcolor.BLUE;

            Console.WriteLine("Area is "+rectangle.calculateArea());
            Console.WriteLine("Color is" + rectangle.BgColor);
           
        }
    }
}
