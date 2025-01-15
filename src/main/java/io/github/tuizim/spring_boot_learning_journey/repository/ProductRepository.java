package io.github.tuizim.spring_boot_learning_journey.repository;

import io.github.tuizim.spring_boot_learning_journey.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product,String>{
}
