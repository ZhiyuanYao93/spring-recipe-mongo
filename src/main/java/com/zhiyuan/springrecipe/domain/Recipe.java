package com.zhiyuan.springrecipe.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Zhiyuan Yao
 */

@Getter
@Setter
public class Recipe {
    private String id;

    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;

    //Hibernate team recommends the use Wrapper class instead of the primitive type.

    private Byte[] images;
    private Difficulty difficulty;

    private Set<Ingredient> ingredients = new HashSet<>();

    private Notes notes;

    private Set<Category> categories = new HashSet<>();


    public void setNotes(Notes notes) {
        if (notes != null) {
            this.notes = notes;
            notes.setRecipe(this);
        }
    }

    public Recipe addIngredient(Ingredient ingredient){
        ingredient.setRecipe(this);
        this.ingredients.add(ingredient);
        return this;
    }

}
