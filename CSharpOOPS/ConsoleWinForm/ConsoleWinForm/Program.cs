using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ComponentModel;
using System.Windows.Forms;
using System.Drawing;

namespace ConsoleWinForm
{
    class Program
    {
        static void Main(string[] args)
        {
            WelcomeForm welcome = new WelcomeForm();
            Application.Run(welcome);
        }
    }
}
