package com.trendyol.demo.repository;

import com.trendyol.demo.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDal implements IProductDal{

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void addProduct(Product product) {
        mongoTemplate.insert(product);
    }

    @Override
    public void updateProduct(Product product) {
        mongoTemplate.save(product);
    }

    @Override
    public List<Product> findByProductCategoryId(int categoryId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("categoryId").is(categoryId));
        return mongoTemplate.find(query,Product.class);
    }
}
