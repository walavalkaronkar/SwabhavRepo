using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Drawing;
using System.ComponentModel;


namespace ConsoleWinForm
{
    class WelcomeForm :Form
    {
        Button button1;
        public WelcomeForm()
        {
            this.Text = "Onkar";
            BackColor = Color.Red;
            button1 = new Button();
            button1.Size = new Size(40, 40);
            button1.Location = new Point(30, 30);
            button1.Text = "Click me";            button1.BackColor = Color.Yellow;            this.Controls.Add(button1);


        }
    }
}
