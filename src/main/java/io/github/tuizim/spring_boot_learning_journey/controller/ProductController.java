package io.github.tuizim.spring_boot_learning_journey.controller;

import io.github.tuizim.spring_boot_learning_journey.model.Product;
import io.github.tuizim.spring_boot_learning_journey.repository.ProductRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("product")
public class ProductController {
    private ProductRepository productRepository;
    public ProductController(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    @PostMapping
    public Product Save(@RequestBody Product product){
        String id = UUID.randomUUID().toString();
        product.setId(id);
        productRepository.save(product);
        System.out.println("product saved: "+ product);
        return product;
    }
}
