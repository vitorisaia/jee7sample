demoApp.controller('CustomerController', function ($scope, CustomerFetcherService) { 
    $scope.customers = [];
    update();

    function update() {  
    	CustomerFetcherService.fetchCustomers().success(function(customersFromServer) {$scope.customers = customersFromServer});
    }

	$scope.addCustomer = function() {
        CustomerFetcherService.addCustomer($scope.newCustomer);
        postAddCustomer();
	};
	
	function postAddCustomer() {
		$scope.customers.push($scope.newCustomer);
        $scope.newCustomer = null;
	}
});

