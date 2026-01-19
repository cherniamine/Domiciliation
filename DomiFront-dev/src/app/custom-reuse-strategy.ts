import { RouteReuseStrategy, ActivatedRouteSnapshot, DetachedRouteHandle } from '@angular/router';

export class CustomReuseStrategy implements RouteReuseStrategy {
  private storedRoutes: { [key: string]: DetachedRouteHandle } = {};

  // Decides whether to detach and store a route
  shouldDetach(route: ActivatedRouteSnapshot): boolean {

    return true; // Store all routes for reuse
  }

  // Store the detached route when it's navigated away from
  store(route: ActivatedRouteSnapshot, handle: DetachedRouteHandle): void {
    if (route.routeConfig?.path) {
      this.storedRoutes[route.routeConfig.path] = handle;
    }
  }

  // Determines if the route should be reattached for reuse
  shouldAttach(route: ActivatedRouteSnapshot): boolean {
    // Check if a stored route exists for the current route
    return !!this.storedRoutes[route.routeConfig?.path!];
  }

  // Retrieve the stored route for reuse
  retrieve(route: ActivatedRouteSnapshot): DetachedRouteHandle | null {
    return this.storedRoutes[route.routeConfig?.path!] || null;
  }

  // Determines whether the current route and future route are the same, meaning it can be reused
  shouldReuseRoute(future: ActivatedRouteSnapshot, curr: ActivatedRouteSnapshot): boolean {
    // Check if the future and current routes are identical
    return future.routeConfig === curr.routeConfig;
  }
}
