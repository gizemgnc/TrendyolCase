package com.trendyol.demo.repository;

import com.trendyol.demo.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryDal implements ICategoryDal {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void addCategory(Category category) {
        mongoTemplate.insert(category);
    }

    @Override
    public void removeCategoryById(int id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        mongoTemplate.remove(query, Category.class);
    }

    @Override
    public void updateCategory(Category category) {
        mongoTemplate.save(category);
    }

    @Override
    public Category findById(int id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        return mongoTemplate.findOne(query, Category.class);
    }
}
