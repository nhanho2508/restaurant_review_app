package com.restaurant_app.restaurant.mappers;

import com.restaurant_app.restaurant.domain.ReviewCreateUpdateRequest;
import com.restaurant_app.restaurant.domain.dtos.ReviewCreateUpdateRequestDto;
import com.restaurant_app.restaurant.domain.dtos.ReviewDto;
import com.restaurant_app.restaurant.domain.entities.Review;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ReviewMapper {

    ReviewCreateUpdateRequest toReviewCreateUpdateRequest(ReviewCreateUpdateRequestDto dto);

    ReviewDto toDto(Review review);

}
