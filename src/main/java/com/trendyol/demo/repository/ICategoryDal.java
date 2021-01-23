package com.trendyol.demo.repository;

import com.trendyol.demo.models.Category;

public interface ICategoryDal {
    void addCategory(Category category);
    void removeCategoryById(int id);
    void updateCategory(Category category);
    Category findById(int id);
}
