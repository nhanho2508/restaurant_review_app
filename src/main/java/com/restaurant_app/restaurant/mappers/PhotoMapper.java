package com.restaurant_app.restaurant.mappers;

import com.restaurant_app.restaurant.domain.dtos.PhotoDto;
import com.restaurant_app.restaurant.domain.entities.Photo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PhotoMapper {

    PhotoDto toDto(Photo photo);

}
