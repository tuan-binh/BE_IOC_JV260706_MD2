package org.example.demomapstruct.models.mappers;

import org.example.demomapstruct.models.dto.req.ProductReq;
import org.example.demomapstruct.models.entities.Category;
import org.example.demomapstruct.models.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(source = "name", target = "name")
    @Mapping(source = "price", target = "price")
    @Mapping(source = "stock", target = "stock")
    @Mapping(source = "categoryId", target = "category", qualifiedByName = "categoryFromId")
    Product toEntity(ProductReq req);

    @Named("categoryFromId")
    default Category categoryFromId(Long id) {
        if (id == null) {
            return null;
        }

        Category category = new Category();
        category.setId(id);

        return category;
    }

}
