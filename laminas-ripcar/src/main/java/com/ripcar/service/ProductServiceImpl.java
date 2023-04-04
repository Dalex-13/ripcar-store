package com.ripcar.service;

import com.ripcar.entitys.Product;
import com.ripcar.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    @Override
    public Product createProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public List<Product> listAllProduct() {
        return repository.findAll();
    }

    @Override
    public Product searchById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Product updateProduct(Product product) {

        return repository.save(product);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }


}
