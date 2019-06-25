
angular.module('empApp')
    .controller('AddController', ['employeeservice', '$scope', '$location','$window', '$rootScope',function (employeeservice, $scope, $location,$window,$rootScope) {

        $scope.employee = employeeservice.getEmployee();
        $scope.dateOfJoining;
        $scope.name;
        $scope.salary;
        $scope.designation;
        $scope.emp;
        console.log($rootScope.admin)
        function onload() {
            if($rootScope.admin)
            {
                $location.path("/add");
            }else{
                $location.path("/");
            }
        }
        onload();
        $scope.addData = function () {
            $scope.emp = {
                id: $scope.name,
                name: $scope.name,
                salary: $scope.salary,
                designation: $scope.designation,
                dateOfJoining: $scope.dateOfJoining
            }
            $scope.employee = employeeservice.getEmployee();
            $scope.employee.push($scope.emp);
            console.log($scope.employee)
            employeeservice.setEmployee($scope.employee);
            $location.path("/");
        }
    }]);