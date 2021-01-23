package com.trendyol.demo.repository;

import com.trendyol.demo.models.Product;

import java.util.List;

public interface IProductDal {
    void addProduct(Product product);
    void updateProduct(Product product);
    List<Product> findByProductCategoryId(int categoryId);
}
