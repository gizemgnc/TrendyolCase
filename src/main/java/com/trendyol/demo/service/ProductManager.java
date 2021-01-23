package com.trendyol.demo.service;

import com.trendyol.demo.models.Product;
import com.trendyol.demo.repository.IProductDal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements IProductManager{

    private IProductDal productDal;

    @Autowired
    public ProductManager(IProductDal productDal) {
        this.productDal = productDal;
    }

    @Override
    public void addProduct(Product product) {
        productDal.addProduct(product);
    }

    @Override
    public void updateProduct(Product product) {
        productDal.updateProduct(product);
    }

    @Override
    public List<Product> findByProductCategoryId(int categoryId) {
        return productDal.findByProductCategoryId(categoryId);
    }
}
