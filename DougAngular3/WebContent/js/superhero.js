/**
 * 
 */
var app=angular.module('superhero',[])

app.directive('superman',function(){
	return {
		restrict: "E",
		template: "<div>Here I am to save the day<div>"
	}
})

app.directive('superdoug',function(){
	return {
		restrict: "A",
		link: function() {
			alert("I'm working");
		}
	}
})