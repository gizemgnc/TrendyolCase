package com.trendyol.demo.repository;

import com.trendyol.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDal implements ILoginDal {
    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public User findUserByUserName(String userName) throws Exception {
            Query query = new Query();
            query.addCriteria(Criteria.where("userName").is(userName));
            return mongoTemplate.findOne(query, User.class);
    }
}
