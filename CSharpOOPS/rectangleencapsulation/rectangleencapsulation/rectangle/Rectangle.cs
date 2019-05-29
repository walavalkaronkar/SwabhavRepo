using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace rectangleencapsulation.rectangle
{
    class Rectangle
    {
        private int _width;
        private int _height;
        private _bgcolor _bgColor;

        public enum _bgcolor
        {
            RED,GREEN,BLUE
        }
        private const int MAX = 100;
        private const int MIN = 0;

        public int Width
        {
            get
            {
                return _width;
            }
            set
            {
                _width = value;
            }
        }
        public int Height
        {
            get
            {
                return _height;
            }
            set
            {
                _height = value;
            }
        }

        public _bgcolor BgColor
        {
            get
            {
                return _bgColor;
            }
            set
            {
                _bgColor = value;
            }
        }

        private int validateValues(int values)
        {
            if (values > MAX)
            {
                return MAX;
            }
            if (values < MIN)
            {
                return MIN;
            }
            return values;

        }

        public int calculateArea()
        {
            int area;
            area = _width * _height;
            return area;
        }

    }
}
