package com.audio.book.controller

import com.audio.book.repository.CategoryRepository
import com.audio.book.domain.Category
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("")
class CategoryController(val categoryRepository: CategoryRepository) {
    @GetMapping("/category")
    fun getCategory(): List<Category> {
        return categoryRepository.findAll();
    }
}