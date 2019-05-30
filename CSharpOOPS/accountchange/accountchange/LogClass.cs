using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace accountchange
{
    class LogClass
    {
        Account _account;
        Log _logs;
        

        public LogClass(Account account)
        {
            _account = account;
            _logs = new Log();
        }

       public Account Account
        {
            get
            {
                return _account;
            }
            
        }

        public Log Logs
        {
            get
            {
                return _logs;
            }
        }

        public string deposit(double amount)
        {
            string message =_account.deposit(amount);
            DateTime aDate = DateTime.Now;
            string datetime = aDate.ToString("MM/dd/yyyy hh:mm tt");
            _logs.add(message+" At "+datetime+" Balance :" + _account.Balance);
            return message;
        }

        public string withdraw(double amount)
        {
            string message = _account.withdraw(amount);
            if (!(message.Equals("")))
            {
                DateTime aDate = DateTime.Now;
                string datetime = aDate.ToString("MM/dd/yyyy hh:mm tt");
                _logs.add(message + " At " + datetime+" Balance :"+_account.Balance);
            }
            return message;
        }
    }
}
