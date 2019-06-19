using System;
using System.Collections.Generic;



namespace EmployeeHirarchy
{
    class Program
    {
        static void Main(string[] args)
        {
            DiskLoader diskLoader = new DiskLoader();
            HashSet<Employee> employees=diskLoader.loadEmployee();

            EmployeeDTO employeeDTO = new EmployeeDTO();
            Dictionary<int, List<Employee>> employeemap =employeeDTO.insertToMap(employees);

            EmployeeBuildHirarchy employeeBuildHirarchy = new EmployeeBuildHirarchy();
            employeeBuildHirarchy.buildHirarchy(employeemap,employees);


            
        }
        
    }
}
