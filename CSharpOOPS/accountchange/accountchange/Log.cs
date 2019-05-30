using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace accountchange
{
    class Log
    {
        private List<string> _log;

        public Log()
        {
            _log = new List<string>();
        }

       public void add(String logg)
        {
            _log.Add(logg);
        }

        public List<String> getList()
        {
            return _log;
        }
    }
}
