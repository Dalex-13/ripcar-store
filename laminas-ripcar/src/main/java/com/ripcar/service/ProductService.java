package com.ripcar.laminas.ripcar.service;

import com.ripcar.laminas.ripcar.entitys.Product;

import java.util.List;

public interface ProductService {

    public Product createProduct(Product product);

    public List<Product> listAllProduct();

    public Product searchById(Long id);

    public Product updateProduct(Product product);

    public void deleteById(Long id);

}
