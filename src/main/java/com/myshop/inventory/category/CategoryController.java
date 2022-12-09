package com.myshop.inventory.category;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping
    public String giveCategory(){
        return "Take Category";
    }

    @PostMapping
    public Category newCategory(@RequestBody Category newCategory) {
        return categoryRepository.save(newCategory);
    }

}
