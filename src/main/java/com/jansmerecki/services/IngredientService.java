package com.jansmerecki.services;

import com.jansmerecki.commands.IngredientCommand;

public interface IngredientService {
    IngredientCommand saveIngredientCommand(IngredientCommand command);

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    void deleteById(Long recipeId, Long idToDelete);
}
