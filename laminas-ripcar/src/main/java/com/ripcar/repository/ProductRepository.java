package com.ripcar.laminas.ripcar.repository;

import com.ripcar.laminas.ripcar.entitys.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
