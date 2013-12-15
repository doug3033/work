/**
 * 
 */

var myApp= angular.module('myApp', []);
myApp.factory('Hobbit', function() {
	var hobbit = {};
	hobbit.cast = [
		{
			name: 'Ian McKellen',
			character: 'Gandalf'
		},
		{
			name: 'Martin Freeman',
			character: 'Bilbo'
		},
		{
			name: 'Richard Armitage',
			character: 'Thorin'
		},
		{
			name: 'Ken Scott',
			character: 'Balin'
		},
		{
			name: 'Graham McTavish',
			character: 'Dwalin'
		},
		{
			name: 'William Kircher',
			character: 'Bifur'
		}
	];
	
	return hobbit;
})

function HobbitCntrl($scope, Hobbit) {
	
	$scope.hobbit = Hobbit;
}