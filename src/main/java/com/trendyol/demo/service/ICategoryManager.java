package com.trendyol.demo.service;

import com.trendyol.demo.models.Category;

public interface ICategoryManager {
    void addCategory(Category category);
    void removeCategoryById(int id);
    void updateCategory(Category category);
    Category findById(int id);
}
