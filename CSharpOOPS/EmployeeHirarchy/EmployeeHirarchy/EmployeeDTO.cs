using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EmployeeHirarchy
{

    class EmployeeDTO
    {
        public Dictionary<int, List<Employee>> insertToMap(HashSet<Employee> employees)
        {
            Dictionary<int, List<Employee>> employeeList = new Dictionary<int, List<Employee>>();

            foreach(Employee employee in employees)
            {
                int id = Int32.Parse(employee.Id);
                employeeList.Add(id, new List<Employee>());
            }

            /*foreach(KeyValuePair<int, List<Employee>> e in employeeList )
            {
                Console.WriteLine(e.Key);
                Console.WriteLine(employeeList[e.Key]);
            }*/
            return employeeList;
        }
    }
}
