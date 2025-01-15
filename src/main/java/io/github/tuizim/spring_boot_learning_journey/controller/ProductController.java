package io.github.tuizim.spring_boot_learning_journey.controller;

import io.github.tuizim.spring_boot_learning_journey.model.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")
public class ProductController {

    @PostMapping
    public Product Save(@RequestBody Product product){
        System.out.println("product saved: "+ product);
        return product;
    }
}
