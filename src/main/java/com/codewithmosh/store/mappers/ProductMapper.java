package com.codewithmosh.store.mappers;

import com.codewithmosh.store.dtos.ProductDTO;
import com.codewithmosh.store.entities.Product;
import org.mapstruct.Ignored;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mapping(target = "categoryId", source = "category.id")
    ProductDTO toProductDTO(Product product);

    Product toEntity(ProductDTO productDTO);

    @Mapping(target = "id", ignore = true)
    void updateProduct(ProductDTO productDTO, @MappingTarget Product product);
}
