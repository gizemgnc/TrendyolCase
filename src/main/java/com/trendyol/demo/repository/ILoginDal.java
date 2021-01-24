package com.trendyol.demo.repository;

import com.trendyol.demo.models.User;

public interface ILoginDal {
    User findUserByUserName(String userName);
}
