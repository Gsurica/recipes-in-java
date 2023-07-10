package com.imp.imp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.imp.imp.api.model.Recipe;

@Service
public class RecipeService {

    private List<Recipe> recipeList;

    public RecipeService() {
        recipeList = new ArrayList<Recipe>();

        Recipe recipe = new Recipe(1, "Arroz", "Arroz delicinha!");
        Recipe recipe1 = new Recipe(2, "feijão", "feijão delicinha!");
        Recipe recipe3 = new Recipe(4, "batata", "batata delicinha!");
        Recipe recipe4 = new Recipe(5, "mandioaca", "mandioaca delicinha!");

        recipeList.addAll(Arrays.asList(recipe, recipe1, recipe3, recipe4));
    }

    public Optional<Recipe> getRecipe(Integer id) {
        Optional optional = Optional.empty();

        for (Recipe recipe : recipeList) {
            if (id == recipe.getId()) {
                optional = Optional.of(recipe);
                return optional;
            }
        }

        return optional;
    }
}
