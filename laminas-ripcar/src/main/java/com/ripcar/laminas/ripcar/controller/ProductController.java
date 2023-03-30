package com.ripcar.laminas.ripcar.controller;

import com.ripcar.laminas.ripcar.entitys.Product;
import com.ripcar.laminas.ripcar.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping
    public Product create(@RequestBody Product product){
        return service.createProduct(product);
    }

    @GetMapping
    public List<Product> listAll(){
        return service.listAllProduct();
    }

    @GetMapping("/search /{id}")
    public Product searchById(@PathVariable Long id){
        Product product = service.searchById(id);
        return product;
    }

    @PutMapping("/search /{id}")
    public Product updateProductById(@RequestBody Product product, @PathVariable Long id){
        Product updatedProduct = service.searchById(id);

        updatedProduct.setName(product.getName());
        updatedProduct.setType(product.getType());
        updatedProduct.setDescription(product.getDescription());
        updatedProduct.setAmount(product.getAmount());
        updatedProduct.setPrice(product.getPrice());
        service.updateProduct(updatedProduct);
        return updatedProduct;
    }

    @DeleteMapping("/search /{id}")
    public void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }

}
