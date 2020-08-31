package com.jansmerecki.services;

import com.jansmerecki.commands.RecipeCommand;
import com.jansmerecki.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
    Recipe findById(Long l);
    RecipeCommand findCommandById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
