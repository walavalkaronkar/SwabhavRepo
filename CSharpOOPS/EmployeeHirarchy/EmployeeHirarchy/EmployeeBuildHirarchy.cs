using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Xml;

namespace EmployeeHirarchy
{
    class EmployeeBuildHirarchy
    {
        XmlWriter xmlWriter;
        public void buildHirarchy(Dictionary<int, List<Employee>> employeeList,HashSet<Employee> employees)
        {
            string xmlbuilder="";
            
            xmlWriter = XmlWriter.Create("C:/Users/onkar/OneDrive/Desktop/test.xml");

            Employee rootEmployee=null;
            foreach(Employee employee in employees)
            {
                int managerId;
                if (employee.ManagerId.Equals("NULL"))
                {
                    managerId = 0;
                    rootEmployee = employee;
                }
                else
                {
                    managerId = int.Parse(employee.ManagerId);
                    //Console.WriteLine(employee);
                    List<Employee> list = employeeList[managerId];
                    list.Add(employee);
                    employeeList[managerId] = list;
                }
            }

            foreach (KeyValuePair<int, List<Employee>> employee in employeeList)
            {
                Console.WriteLine("Key" + employee.Key);
                List<Employee> list = employee.Value;
                Console.WriteLine("List of reportes");
                foreach(Employee e in list)
                {
                    Console.WriteLine(e);
                }
            }

            int rootEmployeeId = int.Parse(rootEmployee.Id);
            int level = 0;
            xmlWriter.WriteStartDocument();
            xmlWriter.WriteStartElement("Employee");
            xmlWriter.WriteAttributeString("managerid", rootEmployee.ManagerId);
            xmlWriter.WriteString(rootEmployee.Name);
            
            Console.WriteLine("<Employee id="+rootEmployee.Id+" name="+rootEmployee.Name+" Designation="+rootEmployee.Designation+
               "ManagerId="+rootEmployee.ManagerId+">");
           

            List<Employee> rootlist=employeeList[rootEmployeeId];
            foreach(Employee employee in rootlist)
            {
                xmlbuilder += GenerateXml(employee,level+1,employeeList,xmlbuilder);
            }


            xmlWriter.WriteEndElement();
            xmlWriter.WriteEndDocument();
            xmlWriter.Close();
            Console.WriteLine("</Employee>");
           

        }

        public string GenerateXml(Employee employee,int level, Dictionary<int, List<Employee>> employeeList,string xmlbuilder)
        {
            for(int space=0;space<level;space++)
            {
                Console.Write("\t");
                
            }
            Console.WriteLine("<Employee id=" + employee.Id + " name=" + employee.Name + " Designation=" + employee.Designation +
                "ManagerId=" + employee.ManagerId + ">");
            xmlWriter.WriteStartElement("Employee");
            xmlWriter.WriteAttributeString("managerid", employee.ManagerId);
            xmlWriter.WriteString(employee.Name);
            

            int employeeId = int.Parse(employee.Id);
            List<Employee> empList = employeeList[employeeId];
            if (empList != null)
            {
                foreach (Employee emp in empList)
                {
                    xmlbuilder+=GenerateXml(emp, level+1, employeeList,xmlbuilder);
                }
            }
            for (int space = 0; space < level; space++)
            {
                Console.Write("\t");
               
            }
            Console.WriteLine("</Employee>");
            xmlWriter.WriteEndElement();
            return xmlbuilder;
        }
    }
}
