package com.zhiyuan.springrecipe.repositories;

import com.zhiyuan.springrecipe.domain.Recipe;

import org.springframework.data.repository.CrudRepository;



public interface RecipeRepository extends CrudRepository<Recipe,String>{

}
