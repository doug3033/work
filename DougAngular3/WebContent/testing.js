/**
 * 
 */
var myApp = angular.module("myApp",[])
myApp.factory('Data', function(){
	return{message: "I'm data from a service"};
})

myApp.filter('reverse', function(){
	return "DCBR";
})

