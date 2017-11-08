package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created by Donald F. Coffin on 11/7/17
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
