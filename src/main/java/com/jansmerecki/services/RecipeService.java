package com.jansmerecki.services;

import com.jansmerecki.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
