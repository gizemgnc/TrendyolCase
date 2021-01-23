package com.trendyol.demo.restApi;

import com.trendyol.demo.models.Category;
import com.trendyol.demo.service.ICategoryManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CategoryController {

    private ICategoryManager categoryManager;

    @Autowired
    public CategoryController(ICategoryManager categoryManager) {
        this.categoryManager = categoryManager;
    }

    @PostMapping("/addCategory")
    public void addUser(@RequestBody Category category){
        categoryManager.addCategory(category);
    }

    @PostMapping("/removeCategory/{id}")
    public void removeUserById(@PathVariable int id){
        categoryManager.removeCategoryById(id);
    }

    @PostMapping("/updateCategory")
    public void updateUser(@RequestBody Category category){
        categoryManager.updateCategory(category);
    }

    @GetMapping("/findCategory/{id}")
    public Category findById(@PathVariable int id){
        return categoryManager.findById(id);
    }
}
