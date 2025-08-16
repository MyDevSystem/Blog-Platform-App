package com.zakdevsystem.blog.services;

import com.zakdevsystem.blog.domain.entities.Category;

import java.util.List;

public interface CategoryService {
    List<Category> listCategories();
    Category createCategory(Category category);
}
