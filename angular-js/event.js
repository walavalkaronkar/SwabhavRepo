            angular.module('myApp', [])
              .controller('myCtrl',['$scope','$timeout',function($scope,$timeout) 
              {
                //$scope.count = 0;
               
                $scope.myFunc = function() 
                {
                    $scope.student =  
                    [{
                        id:"101",
                        name:"onkar",
                        image:"student.jpg",
                        cgpa:"7"
                    },
                    {
                        id:"102",
                        name:"deepak",
                        image:"student.jpg",
                        cgpa:"8"
                    },
                    {
                        id:"103",
                        name:"umesh",
                        image:"student.jpg",
                        cgpa:"8"
                    },
                    {
                        id:"105",
                        name:"shekar",
                        image:"student.jpg",
                        cgpa:"6"
                    },
                    {
                        id:"106",
                        name:"mahesh",
                        image:"student.jpg",
                        cgpa:"7"
                    }
                    ]
                    
                }
                $scope.istrue=false;
                $scope.toggle=function()
                {
                    if($scope.istrue)
                    {
                        $scope.istrue=false;
                    }
                    else
                    {
                        $scope.istrue=true;
                    }
                }
            }])

           
            .filter("Demofilter",[function(){
                return function(input)
                {
                    if(input>=8)
                    {
                        myobj={'background-color' : '#80ff80'}
                        return myobj;
                    }
                    else if(input>=7)
                    {
                        myobj={'background-color' : '#ffff4d'}
                        return myobj;
                    }
                    else 
                    {
                        myobj={'background-color' : '#ff3333'}
                        return myobj;
                    }
                }
            }]);
    
    