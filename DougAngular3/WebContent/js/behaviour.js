/**
 * 
 */
var app = angular.module("behaviorApp", [])

app.directive("enter", function() {
	return function(scope, element, attr) {
		element.bind("mouseenter", function() {
			element.addClass(attr.enter);
		})
	}	
})

app.directive("leave", function() {
	return function(scope, element,attr) {
		element.bind("mouseleave", function() {
			element.removeClass(attr.enter);
		})
	}
})
