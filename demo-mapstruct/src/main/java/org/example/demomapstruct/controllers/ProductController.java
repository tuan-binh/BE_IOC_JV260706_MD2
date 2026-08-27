package org.example.demomapstruct.controllers;

import lombok.RequiredArgsConstructor;
import org.example.demomapstruct.models.dto.req.ProductReq;
import org.example.demomapstruct.models.services.IProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {
    private final IProductService productService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(productService.findAll());
    }

    @PostMapping
    public ResponseEntity<?> addNewProduct(@RequestBody ProductReq req) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.addNewProduct(req));
    }

}
