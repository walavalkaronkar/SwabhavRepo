using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using circle_consructor.circle;

namespace circle_consructor
{
    class Program
    {
        static void Main(string[] args)
        {
            Circle[] circleArray = new Circle[3];

            Circle small = new Circle(1.5f, Circle.BorderStyle.DOUBLE_LINE);
            Circle big = new Circle(5.5f, Circle.BorderStyle.DOUBLE_LINE);
            Circle medium = new Circle(3.5f, Circle.BorderStyle.DOTTED);

            circleArray[0] = small;
            circleArray[1] = big;
            circleArray[2] = medium;

            displayCircleDetails(circleArray);
        }

        public static void displayCircleDetails(Circle[] circleArray)
        {
            double sumOfAreaCircles = 0.0;
            foreach (Circle c in circleArray)
            {
                Console.WriteLine("area " + c.calculateArea());
                Console.WriteLine("perimeter " + c.calculatePerimeter());
                sumOfAreaCircles = sumOfAreaCircles + c.calculateArea();
            }
            Console.WriteLine("Sum of Area of Circle " + sumOfAreaCircles);
        }
    }
}
