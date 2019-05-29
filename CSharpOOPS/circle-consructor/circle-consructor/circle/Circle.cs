using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace circle_consructor.circle
{
    class Circle
    {
        private float _radius;
        private BorderStyle _border;
        private const float PI= 3.14f; 
        public enum BorderStyle
        {
            DOTTED, SINGLE_LINE, DOUBLE_LINE
        }

        public Circle(float radius, BorderStyle border)
        {
            _radius = radius;
            _border = border;
        }

        public float Radius
        {
            get
            {
                return _radius;
            }
        }

        public BorderStyle Border
        {
            get
            {
                return _border;
            }
        }
        public double calculateArea()
        {
            double area;
            area = PI * _radius * _radius;
            return area;
        }

        public double calculatePerimeter()
        {
            double perimeter;
            perimeter = 2 * PI * _radius;
            return perimeter;
        }
    }
}
