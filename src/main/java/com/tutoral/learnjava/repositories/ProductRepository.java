package com.tutoral.learnjava.repositories;

import com.tutoral.learnjava.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
