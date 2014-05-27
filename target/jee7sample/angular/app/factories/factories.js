var customerFetcherService = function($http){
    return {
        fetchCustomers: function() {
            return $http.get('resources/customer/fetchall');
        },
        addCustomer: function(newCustomer) {
            $http.post('resources/customer/create', newCustomer);
        }
    };
};

demoApp.factory('CustomerFetcherService', customerFetcherService);