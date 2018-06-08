class Router {
    Router() {
        Route.add("/api/v1/coins/buy", CoinsController::buy);
    }
}