angular.module('empApp')
    .factory('employeeservice', [function () {

        var object = {};
        var login=false;
        var loginuser="";
        var loginids = [
            {
                username: "onkar",
                password: "onkar"
            },
            {
                username: "root",
                password: "root"
            }]
        var employee = [
            {
                id: "",
                name: "shekar",
                salary: "27000",
                designation: "Developer",
                dateOfJoining: "10/07/2019"

            },
            {
                id: "",
                name: "mahesh",
                salary: "15000",
                designation: "Developer",
                dateOfJoining: "10/07/2019"

            },
            {
                name: "abhishek",
                salary: "17000",
                designation: "Developer",
                dateOfJoining: "10/07/2019"

            },
            {
                id: "",
                name: "deepak",
                salary: "25000",
                designation: "Developer",
                dateOfJoining: "10/07/2019"

            },
            {
                id: "",
                name: "suraj",
                salary: "27000",
                designation: "Tester",
                dateOfJoining: "10/07/2019"

            },
            {
                id: "",
                name: "vikas",
                salary: "27000",
                designation: "Analyst",
                dateOfJoining: "10/07/2019"

            }];

        object.getEmployee = function () {
            return employee
        }

        object.setEmployee = function (emp) {
            employee = emp;
            return employee;
        }

        object.deleteEmployee = function (index) {
                employee.splice(index, 1);
                return employee;
        }
       
        object.isLoggedIn=function()
        {
            return login;
        }

        object.checkLogin=function(name,pass)
        {
            for(let index=0;index<loginids.length;index++)
            {
                if(name==loginids[index].username && pass==loginids[index].password)
                {
                    loginuser=loginids[index];

                    if (typeof(Storage) !== "undefined") 
                    {
                        sessionStorage.setItem("login", true);
                    }
                    login=true;
                    return true;
                }
            }
            return false;
        }

        object.logout=function()
        {
            login=false;
            loginuser="";
            sessionStorage.setItem("login", false);
            return true;
        }

        object.getLoggedInUser=function()
        {
            return loginuser;
        }

        return object;
    }])