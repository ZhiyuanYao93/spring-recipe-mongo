package com.zhiyuan.springrecipe.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Zhiyuan Yao
 */

@Getter
@Setter
@NoArgsConstructor
public class NotesCommand {
    private String id;
    private String recipeNotes;
}
