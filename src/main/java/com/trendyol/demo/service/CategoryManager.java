package com.trendyol.demo.service;

import com.trendyol.demo.models.Category;
import com.trendyol.demo.repository.ICategoryDal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryManager implements ICategoryManager{

    private ICategoryDal categoryDal;

    @Autowired
    public CategoryManager(ICategoryDal categoryDal) {
        this.categoryDal = categoryDal;
    }

    @Override
    public void addCategory(Category category) {
        categoryDal.addCategory(category);
    }

    @Override
    public void removeCategoryById(int id) {
        categoryDal.removeCategoryById(id);
    }

    @Override
    public void updateCategory(Category category) {
        categoryDal.updateCategory(category);
    }

    @Override
    public Category findById(int id) {
        return categoryDal.findById(id);
    }
}
