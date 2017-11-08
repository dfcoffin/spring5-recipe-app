package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Donald F. Coffin on 9/18/17
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}

