using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace rectangle_app.rectangle
{
    class Rectangle
    {
        private int height;
        private int width;
        public Rectangle(int height,int width)
        {
            this.height = height;
            this.width = width;
        }

        public int calculateArea()
        {
            int area = width * height;
            return area;
        }
    }
}
