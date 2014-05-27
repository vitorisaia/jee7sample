var demoApp = angular.module('demoApp', ['ngRoute']);

demoApp.config(function ($routeProvider) {
	$routeProvider.when('/view1', 
		{
            controller: 'CustomerController',
			templateUrl: 'partials/view1.html'
		}
	).when('/view2', 
		{
			controller: 'CustomerController',
			templateUrl: 'partials/view2.html'
		}
	).otherwise({redirectTo: '/view1'})
});	