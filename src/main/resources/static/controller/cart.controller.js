app.controller('cartCtrl', function ($scope, $http, $routeParams) {
    $scope.id = $routeParams.id;
    let id = $scope.id;

    if (!!id) {
        $http.get("/api/carts/" + id)
            .then(function (response) {
                $scope.cart = response.data;
            });
    } else {
        $http.get("/api/carts")
            .then(function (response) {
                $scope.carts = response.data;
            });
    }

});