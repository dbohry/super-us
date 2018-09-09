var app = angular.module('super-ui', ["ngRoute"]);

app.config(function ($routeProvider) {
    $routeProvider
        .when("/", {
            templateUrl: "view/home.html"
        })
        .when("/carts", {
            templateUrl: "view/carts.html"
        })
});
