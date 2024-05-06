package net.infydeepak.springbootsearchrestapi.service.impl;

import net.infydeepak.springbootsearchrestapi.entity.Product;
import net.infydeepak.springbootsearchrestapi.repository.ProductRepository;
import net.infydeepak.springbootsearchrestapi.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProducts(String query) {
      List<Product> products =  productRepository.searchProducts(query);
      return products;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
