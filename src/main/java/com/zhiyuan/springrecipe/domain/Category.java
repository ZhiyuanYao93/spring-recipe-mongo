package com.zhiyuan.springrecipe.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * @author Zhiyuan Yao
 */

@Getter
@Setter
public class Category {

    private String id;

    private String description;

    private Set<Recipe> recipes;
}
