var app = angular.module('super-ui', ["ngRoute"]);

app.config(function ($routeProvider) {
    $routeProvider
        .when("/", {
            templateUrl: "view/carts.html",
            controller : "cartCtrl"
        })
        .when("/:id", {
            templateUrl: "view/carts.html",
            controller : "cartCtrl"
        })
});
