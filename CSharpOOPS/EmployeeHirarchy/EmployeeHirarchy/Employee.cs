using System;
using System.Collections.Generic;

namespace EmployeeHirarchy
{
    class Employee
    {

        private string employeeId;
        private string employeeName;
        private string empDesignation;
        private string managerId;
        private string dateOfJoining;
        private double salary;
        private string commision;
        private int departmentNumber;


        public string Id
        {
            get
            {
                return employeeId;
            }
            set
            {
                employeeId = value;
            }
        }

        public string Name
        {
            get
            {
                return employeeName;
            }
            set
            {
                employeeName = value;
            }
        }
        public string Designation
        {
            get
            {
                return empDesignation;
            }
            set
            {
                empDesignation = value;
            }
        }
        public string ManagerId
        {
            get
            {
                return managerId;
            }
            set
            {
                managerId = value;
            }
        }

        public string Date
        {
            get
            {
                return dateOfJoining;
            }
            set
            {
                dateOfJoining = value;
            }
        }

        public double Salary
        {
            get
            {
                return salary;
            }
            set
            {
                salary = value;
            }
        }

        public string Commision
        {
            get
            {
                return commision;
            }
            set
            {
                commision = value;
            }
        }

        public int DepartmentId
        {
            get
            {
                return departmentNumber;
            }
            set
            {
                departmentNumber = value;
            }
        }

        public override bool Equals(object obj)
        {
            var employee = obj as Employee;
            return employee != null &&
                   employeeId == employee.employeeId &&
                   employeeName == employee.employeeName &&
                   empDesignation == employee.empDesignation &&
                   managerId == employee.managerId &&
                   dateOfJoining == employee.dateOfJoining &&
                   salary == employee.salary &&
                   commision == employee.commision &&
                   departmentNumber == employee.departmentNumber;
        }

        public override int GetHashCode()
        {
            var hashCode = -417336199;
            hashCode = hashCode * -1521134295 + employeeId.GetHashCode();
            hashCode = hashCode * -1521134295 + EqualityComparer<string>.Default.GetHashCode(employeeName);
            hashCode = hashCode * -1521134295 + EqualityComparer<string>.Default.GetHashCode(empDesignation);
            hashCode = hashCode * -1521134295 + EqualityComparer<string>.Default.GetHashCode(managerId);
            hashCode = hashCode * -1521134295 + EqualityComparer<string>.Default.GetHashCode(dateOfJoining);
            hashCode = hashCode * -1521134295 + salary.GetHashCode();
            hashCode = hashCode * -1521134295 + EqualityComparer<string>.Default.GetHashCode(commision);
            hashCode = hashCode * -1521134295 + departmentNumber.GetHashCode();
            return hashCode;
        }

        public override string ToString()
        {
            return "" + employeeId + " " + employeeName + " " + empDesignation + " " + managerId + " " + 
                dateOfJoining + " " + salary + " " + commision + " " + departmentNumber;
        }
    }
}
