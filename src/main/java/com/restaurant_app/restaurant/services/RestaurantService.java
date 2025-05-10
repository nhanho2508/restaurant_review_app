package com.restaurant_app.restaurant.services;

import com.restaurant_app.restaurant.domain.RestaurantCreateUpdateRequest;
import com.restaurant_app.restaurant.domain.entities.Restaurant;

public interface RestaurantService {
    Restaurant createRestaurant(RestaurantCreateUpdateRequest request);
}
