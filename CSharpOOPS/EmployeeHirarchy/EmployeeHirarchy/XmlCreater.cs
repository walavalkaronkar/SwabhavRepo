using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EmployeeHirarchy
{
    class XmlCreater
    {

        public void createXml(HashSet<Employee> employees)
        {
            HashSet<Employee> employeeList = new HashSet<Employee>(employees);
            Stack<string> managerid = new Stack<string>();
            int level = 0;
            foreach (Employee employee in employeeList)
            {
                //Console.WriteLine(employee.ManagerId);
                if (employee.ManagerId.Equals("NULL"))
                {
                    managerid.Push(employee.Id);
                    Console.WriteLine(employee);
                    break;
                }
            }

            
            //Console.WriteLine(managerid.Peek());

            
                foreach (Employee employee in employees)
                {
                    String mid = managerid.Peek();
                    int count = managerid.Count();
                    if (employee.ManagerId.Equals(mid))
                    {
                        level = 1;
                        for (int i = 0; i < level; i++)
                        {
                            Console.Write("\t");
                        }
                        Console.WriteLine(employee);
                        managerid.Push(employee.Id);
                        do
                        {
                            Employee emp = getChild(employeeList, managerid.Peek());
                            if (emp == null)
                            {
                                level = level - 1; 
                                //Console.WriteLine(emp);
                                string id = managerid.Pop();
                                foreach (Employee e in employeeList)
                                {
                                    if (e.Id.Equals(id))
                                    {
                                        //foreach(String s in managerid)
                                        //{
                                        //    Console.Write(s+" ");
                                        //}
                                        //Console.WriteLine();
                                        //Console.WriteLine(e);

                                        employeeList.Remove(e);
                                        break;
                                    }
                                }
                               
                            }
                            else
                            {
                                level = level + 1;
                                for (int i=0; i<level;i++)
                                {
                                    Console.Write("\t");
                                }
                                
                                Console.WriteLine(emp);
                                managerid.Push(emp.Id);
                            }
                        } while (count<managerid.Count());

                        
                    }
                    
                }
            //Console.WriteLine(managerid.Count);
            string id1 = managerid.Pop();
            foreach (Employee e in employeeList)
            {
                if (e.Id.Equals(id1))
                {
                    /*foreach (String s in managerid)
                    {
                        Console.Write(s + " ");
                    }
                    Console.WriteLine();
                    Console.WriteLine(e);
                    */
                    //Console.WriteLine(e);
                    employeeList.Remove(e);
                    break;
                }
            }

        }


        public Employee getChild(HashSet<Employee> employees, String managerId)
        {
            Employee emp = null;
            foreach (Employee employee in employees)
            {
                if (employee.ManagerId.Equals(managerId))
                {
                    emp = employee;
                    return emp;
                }
            }
            return emp;
        }
    }
}
