package com.zhiyuan.springrecipe.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Zhiyuan Yao
 */

@Getter
@Setter
public class Notes {
    private String id;

    private  Recipe recipe;

    private String recipeNotes;

}
