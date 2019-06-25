angular.module('acmeApp')
    .controller('ProductDetailsController', ['$scope','$routeParams','$rootScope','productservice', function ($scope,$routeParams,$rootScope,productservice) {

        //productservice.getProducts();
        $scope.index=$routeParams.id;
        console.log($rootScope.products);        
        console.log($rootScope.products[$scope.index]);
        $scope.productname=$rootScope.products[$scope.index].productName;
        $scope.productCode=$rootScope.products[$scope.index].productCode;
        $scope.description=$rootScope.products[$scope.index].description;
        $scope.avaliability=$rootScope.products[$scope.index].releaseDate
        $scope.price=$rootScope.products[$scope.index].price;
        $scope.starRating=$rootScope.products[$scope.index].starRating;
        $scope.imageUrl=$rootScope.products[$scope.index].imageUrl;
    }])