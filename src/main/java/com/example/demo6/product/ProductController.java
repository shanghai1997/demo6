package com.example.demo6.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @PostMapping(value={"/product", "/api/product"})
    @ResponseStatus(code = HttpStatus.CREATED)
    @ResponseBody
    public Product addProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }
}
