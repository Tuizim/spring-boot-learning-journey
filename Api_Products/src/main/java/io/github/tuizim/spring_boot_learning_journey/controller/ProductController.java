package io.github.tuizim.spring_boot_learning_journey.controller;

import io.github.tuizim.spring_boot_learning_journey.model.Product;
import io.github.tuizim.spring_boot_learning_journey.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("product")
public class ProductController {
    private ProductRepository productRepository;
    public ProductController(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    @PostMapping
    public Product save(@RequestBody Product product){
        String id = UUID.randomUUID().toString();
        product.setId(id);
        productRepository.save(product);
        System.out.println("product saved: "+ product);
        return product;
    }
    @GetMapping("{id}")
    public Product getById(@PathVariable("id") String id){
        return productRepository.findById(id).orElse(null);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") String id){
        productRepository.deleteById(id);
    }
    @PutMapping("{id}")
    public void update(@PathVariable String id,@RequestBody Product product){
        product.setId(id);
        productRepository.save(product);
    }
    @GetMapping
    public List<Product> search(@RequestParam String name){
        return productRepository.findByName(name);
    }
}
