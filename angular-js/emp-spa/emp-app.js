angular.module('empApp', ['ngRoute'])

    .config(function ($routeProvider) {
        $routeProvider
            .when('/',
                {
                    templateUrl: 'fragments/home.html'
                    , controller: 'HomeController'
                })
            .when('/add',
                {
                    templateUrl: 'fragments/add.html'
                    , controller: 'AddController'
                })
            .when('/edit/:id',
                {
                    templateUrl: 'fragments/edit.html',
                    controller: 'EditController'
                })
            .when('/login',
                {
                    templateUrl: 'fragments/login.html',
                    controller: 'LoginController'
                })
    });