package com.restaurant_app.restaurant.services;

import com.restaurant_app.restaurant.domain.ReviewCreateUpdateRequest;
import com.restaurant_app.restaurant.domain.entities.Review;
import com.restaurant_app.restaurant.domain.entities.User;

public interface ReviewService {
    Review createReview(User author, String restaurantId, ReviewCreateUpdateRequest review);
}
