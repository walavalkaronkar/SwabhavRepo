

angular.module('spaApp', ['ngRoute'])
    .config(function ($routeProvider) {
        $routeProvider
            .when('/', 
            { 
                templateUrl: 'fragments/history.html'
                , controller: 'HistoryController'
             })
            .when('/politics', 
            { templateUrl: 'fragments/politics.html'
            , controller: 'PoliticsController' })
            .when('/places', { templateUrl: 'fragments/places.html', controller: 'PlacesController' })
    })

    .controller('HistoryController', ['$scope', function ($scope) {

        $scope.data = ' history When beginning to choose your solution to create a new mobile application, you are often faced with a wide range of options, but are unsure of where to begin. Is building your application solely with native solutions the right choice? Should your team look at only developing with web technologies? What about someof the hybrid solutions out there? These are among the many questions that arise when deliberating whichpath is best for your business.'
    }])

    .controller('PoliticsController', ['$scope', function ($scope) {

        $scope.data1 = 'politics When beginning to choose your solution to create a new mobile application, you are often faced with a wide range of options, but are unsure of where to begin. Is building your application solely with native solutions the right choice? Should your team look at only developing with web technologies? What about someof the hybrid solutions out there? These are among the many questions that arise when deliberating whichpath is best for your business.'
    }])

    .controller('PlacesController', ['$scope', function ($scope) {

        $scope.data2 = 'places When beginning to choose your solution to create a new mobile application, you are often faced with a wide range of options, but are unsure of where to begin. Is building your application solely with native solutions the right choice? Should your team look at only developing with web technologies? What about someof the hybrid solutions out there? These are among the many questions that arise when deliberating whichpath is best for your business.'
    }]);