package com.example.hana.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserSignInRequestDto {
    String id;
    String password;

    public UserSignInRequestDto(String id, String password){
        this.id=id;
        this.password=password;
    }
}
