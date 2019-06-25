angular.module('empApp')
    .controller('HomeController', ['$scope', 'employeeservice', '$location','$rootScope','$window', function ($scope, employeeservice, $location,$rootScope,$window) {
        $scope.employees = employeeservice.getEmployee();
        $scope.deleteData = function (index) {
            console.log(index);

            $scope.result=employeeservice.isLoggedIn();
            if ($scope.result == false) {
                alert("Please Login first");
                $location.path("/login");
            }
            else 
            {
                $scope.confirm = confirm("Are u sure you want to delete?");
                if (confirm) {
                    $scope.employees = employeeservice.deleteEmployee(index);
                }
            }
        }
    }]);