/**
 * 
 */
var app=angular.module('twitterApp', [])

app.controller("AppCntrl", function($scope){
	$scope.loadMoreTweets = function() {
		alert("LoadingTweets");
	}
})

app.directive("enter", function(){
	return function(scope, element, attrs) {
		element.bind("mouseenter", function(){
			scope.$apply(attrs.enter);
		})
	}
})