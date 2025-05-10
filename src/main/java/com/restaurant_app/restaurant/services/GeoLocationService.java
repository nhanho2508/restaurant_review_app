package com.restaurant_app.restaurant.services;

import com.restaurant_app.restaurant.domain.GeoLocation;
import com.restaurant_app.restaurant.domain.entities.Address;

public interface GeoLocationService {
    GeoLocation geoLocate(Address address);
}
