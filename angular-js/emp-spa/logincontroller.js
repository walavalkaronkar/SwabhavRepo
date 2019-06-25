angular.module('empApp')
    .controller('LoginController', ['employeeservice', '$scope', '$location', '$rootScope', '$window', function (employeeservice, $scope, $location, $rootScope, $window) {

        $scope.username;
        $scope.password;
        $rootScope.user = "";

        $rootScope.display = true;
        $rootScope.editbutton = true;
        $scope.login = function () {
            $scope.valid = employeeservice.checkLogin($scope.username, $scope.password);
            if ($scope.valid) {
                $window.sessionStorage.username = $scope.username;
                $window.sessionStorage.password = $scope.password;
                $rootScope.user = $scope.username;
                $rootScope.admin=true;
                $rootScope.display = false;
                $rootScope.editbutton = false;
                $location.path("/");
            }
            else {
                alert("Invalid username and password");
            }
        }

        function loginDetails() {
            if ($window.sessionStorage.username != "" && $window.sessionStorage.password != "") {
                $scope.username = $window.sessionStorage.username;
                $scope.password = $window.sessionStorage.password;
                $rootScope.user = $scope.username;
                $rootScope.admin=true;
                $rootScope.display = false;
                $rootScope.editbutton = false;
            }
        }

        loginDetails();
        $scope.logout = function () {
            $scope.result = confirm("Are u sure you want to logout?");
            if ($scope.result) {
                $scope.valid = employeeservice.logout();
                if ($scope.valid) {
                    $rootScope.display = true;
                    $rootScope.user = "";
                    $rootScope.editbutton = true;
                    $rootScope.admin = false;
                    $window.sessionStorage.username = "";
                    $window.sessionStorage.password = "";
                    $location.path("/");
                }
            }
        }

    }]);