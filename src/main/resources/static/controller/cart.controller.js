app.controller('cartCtrl', function ($scope, $http, $routeParams) {

    $scope.id = $routeParams.id;
    $scope.showForm = false;
    $scope.product = {};

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

    $scope.add = function add() {
        $scope.cart.products.push($scope.product);
        $http.put("/api/carts/" + id, $scope.cart)
            .then(function (response) {
                $scope.carts = response.data;
            });
    };

    $scope.cancel = function cancel() {
        $scope.product = {};
        $scope.showForm = false
    };

});