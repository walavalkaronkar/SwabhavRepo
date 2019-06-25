angular.module('acmeApp')
    .factory('productservice', ['$http','$q','$rootScope',function ($http,$q,$rootScope) {

        var object={};

        object.getProducts=function()
        {
            return $q((resolve,reject)=>{
                $http({
                    method:"GET",
                    url:"../products.json"

                })
                .then(function(response){
                    //console.log("service"+response.data);
                    $rootScope.products=response.data;
                    resolve(response.data);    
                })

            })
        }

        return object;
    }]);