package com.forrent.Vehicle.web.controller;

import com.forrent.Vehicle.dao.CategoryDao;
import com.forrent.Vehicle.model.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {
    private final CategoryDao categoryDao;

@GetMapping("/category")
    public List<Category> list(){return categoryDao.findAll();}

    public CategoryController(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }
}
