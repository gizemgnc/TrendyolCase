package com.trendyol.demo.restApi;

import com.trendyol.demo.models.Product;
import com.trendyol.demo.service.IProductManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    private IProductManager productManager;

    @Autowired
    public ProductController(IProductManager productManager) {
        this.productManager = productManager;
    }

    @PostMapping("/addProduct")
    public void addProduct(@RequestBody Product product) {
        productManager.addProduct(product);
    }

    @PostMapping("/updateProduct")
    public void updateProduct(@RequestBody Product product) {
        productManager.updateProduct(product);
    }

    @GetMapping("/findProductCategory/{categoryId}")
    public List<Product> findByProductCategoryId(@PathVariable int categoryId) {
        return productManager.findByProductCategoryId(categoryId);
    }

}
