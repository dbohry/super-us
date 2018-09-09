app.controller('cartCtrl', function ($scope, $http) {

    $http.get("/api/carts")
        .then(function (response) {
            $scope.carts = response.data;
        });

});