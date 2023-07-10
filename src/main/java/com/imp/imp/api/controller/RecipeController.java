package com.imp.imp.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.imp.imp.api.model.Recipe;
import com.imp.imp.service.RecipeService;

@RestController
public class RecipeController {

    private RecipeService recipeService;

    @Autowired
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/recipe")
    public Recipe getRecipe(@RequestParam Integer id) {
        Optional recipe = this.recipeService.getRecipe(id);

        if (recipe.isPresent()) {
            return (Recipe) recipe.get();
        }

        return null;
    }
}
