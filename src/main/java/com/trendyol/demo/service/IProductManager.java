package com.trendyol.demo.service;

import com.trendyol.demo.models.Product;

import java.util.List;

public interface IProductManager {
    void addProduct(Product product);
    void updateProduct(Product product);
    List<Product> findByProductCategoryId(int categoryId);
}
