angular.module('acmeApp', ['ngRoute','ngSanitize'])

    .config(function ($routeProvider) {
        $routeProvider
            .when('/',
                {
                    templateUrl: '../fragments/home.html'
                    , controller: 'WelcomeController'
                })
            .when('/productDetails/:id',
                {
                    templateUrl: '../fragments/product-details.html'
                    , controller: 'ProductDetailsController'
                })
            .when('/productList',
                {
                    templateUrl: '../fragments/product-list.html',
                    controller: 'ProductListController'
                })
    })
    .directive('star', function () {
        var directive = {
            template: '<i class="fa fa-star" aria-hidden="true"></i>',
            restrict: 'E'
        };
        return directive;

    })


    .filter('Starfilter', function () {
        return function (input) {
            let images="";
            let index;
            for(index=1;index<input;index++)
            {
                images=images+"<i class='fa fa-star' aria-hidden='true'></i>";
            }
            index--;
            console.log("index"+index);
            let temp=input-index;
            console.log("temp"+temp);
            if(temp>0)
            {
                index++;
                images=images+"<i class='fa fa-star-half' aria-hidden='true'></i>";
            }
            return images;
        }
    });


