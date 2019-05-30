using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace accountchange
{
    class Account
    {
        private double _balance;
        private string _name;
        private string _number;
        static private int acc_number=101;

        public Account(string name)
        {
            _name = name;
            _number = ""+acc_number++;
            _balance = 1000;
        }

        public double Balance
        {
            get
            {
                return _balance;
            }
        }
        public string Name
        {
            get
            {
                return _name;
            }
        }
        public string Number
        {
            get
            {
                return _number;
            }
        }

        public string deposit(double amount)
        {
            _balance += amount;
            string message = "Amount deposit " + amount;
            return message;
        }

        public string withdraw(double amount)
        {
            string message="";
            if (_balance - amount >= 500)
            {
                _balance -= _balance - amount;
                message = "Amount withdarwn" + amount;
                return message;
            }
            return message;
        }
    }
}
