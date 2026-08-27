package org.example.demomapstruct.models.services;

import org.example.demomapstruct.models.dto.req.ProductReq;
import org.example.demomapstruct.models.entities.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    Product addNewProduct(ProductReq req);
}
