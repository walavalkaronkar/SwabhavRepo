angular.module('acmeApp')
    .controller('ProductListController', ['$scope','$http','$rootScope','productservice',function ($scope,$http,$rootScope,productservice) {

        productservice.getProducts();
        console.log($rootScope.products);
        $rootScope.buttondata="show image";
        $rootScope.showbutton=true;

        $scope.buttontoogle=function()
        {
            if($rootScope.showbutton)
            {
                $rootScope.showbutton=false;
                $rootScope.buttondata="hide image";
            }
            else
            {
                $rootScope.showbutton=true;
                $rootScope.buttondata="show image";
            }
        }
          
    }])