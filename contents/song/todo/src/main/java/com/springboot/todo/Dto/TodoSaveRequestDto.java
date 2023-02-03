package com.springboot.todo.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class TodoSaveRequestDto {
    private String item;
    private Boolean isDone;

    public TodoSaveRequestDto(String item, Boolean isDone){
        this.item=item;
        this.isDone=isDone;
    }
}
