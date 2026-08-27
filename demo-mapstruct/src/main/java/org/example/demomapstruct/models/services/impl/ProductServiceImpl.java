package org.example.demomapstruct.models.services.impl;

import lombok.RequiredArgsConstructor;
import org.example.demomapstruct.models.dto.req.ProductReq;
import org.example.demomapstruct.models.entities.Product;
import org.example.demomapstruct.models.mappers.ProductMapper;
import org.example.demomapstruct.models.repositories.IProductRepository;
import org.example.demomapstruct.models.services.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements IProductService {
    private final IProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product addNewProduct(ProductReq req) {
        return productRepository.save(productMapper.toEntity(req));
    }
}
