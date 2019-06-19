using System;
using System.Collections.Generic;
using System.IO;

namespace EmployeeHirarchy
{
    class DiskLoader
    {

        public HashSet<Employee> loadEmployee()
        {
            HashSet<Employee> employees = new HashSet<Employee>();
            FileStream f = new FileStream("D:/SwabhavRepository/CSharpOOPS/EmployeeHirarchy/EmployeeHirarchy/DataFile.txt", FileMode.Open);
            StreamReader s = new StreamReader(f);

            string line = "";
            while ((line = s.ReadLine()) != null)
            {
                employees=loadEmployee(employees, line);
            }
            foreach(Employee employee in employees)
            {
                Console.WriteLine(employee);
            }
            s.Close();
            f.Close();
            return employees;
        }

        private HashSet<Employee> loadEmployee(HashSet<Employee> emp, String s)
        {
            String[] details = s.Split(',');
            Employee employee = new Employee();
            employee.Id=(details[0]);
            employee.Name=(details[1].Substring(1, details[1].Length-2));
            employee.Designation=(details[2].Substring(1, details[2].Length - 2));
            employee.ManagerId=(details[3]);
            employee.Date=(details[4].Substring(1, details[4].Length - 2));
            employee.Salary=(Double.Parse(details[5]));
            employee.Commision=(details[6]);
            employee.DepartmentId=(Int32.Parse(details[7]));
 
            emp.Add(employee);
            return emp;
        }
    }
}
