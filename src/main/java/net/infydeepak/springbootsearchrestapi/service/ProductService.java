package net.infydeepak.springbootsearchrestapi.service;

import net.infydeepak.springbootsearchrestapi.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
