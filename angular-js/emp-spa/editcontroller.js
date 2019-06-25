angular.module('empApp')
    .controller('EditController', ['employeeservice','$scope','$routeParams','$location','$window', function (employeeservice,$scope,$routeParams, $location,$window ) {
        $scope.index=$routeParams.id;

        function onload() {
            if($rootScope.admin)
            {
                $location.path("/");
            }
        }
        onload();

        $scope.employees=employeeservice.getEmployee();
        console.log($scope.employees);
        $scope.name=$scope.employees[$scope.index].name;
        $scope.salary=Number($scope.employees[$scope.index].salary);
        $scope.designation=$scope.employees[$scope.index].designation;
        $scope.dateOfJoining=$scope.employees[$scope.index].dateOfJoining;

        $scope.updateData=function()
        {
            $scope.employee=employeeservice.getEmployee();
            $scope.emp={
                name: $scope.name,
                salary: $scope.salary,
                designation: $scope.designation,
                dateOfJoining: $scope.dateOfJoining
            }
           
            $scope.employees[$scope.index]=($scope.emp);
            console.log($scope.employees)
            employeeservice.setEmployee($scope.employees);
            $location.path("/");
    }
    }]);