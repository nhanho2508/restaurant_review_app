package com.restaurant_app.restaurant.services;

import com.restaurant_app.restaurant.domain.ReviewCreateUpdateRequest;
import com.restaurant_app.restaurant.domain.entities.Review;
import com.restaurant_app.restaurant.domain.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ReviewService {
    Review createReview(User author, String restaurantId, ReviewCreateUpdateRequest review);
    Page<Review> listReviews(String restaurantId, Pageable pageable);
}
