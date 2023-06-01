package com.ifutsalu.dto.user;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Builder
@Getter
public class UserLoginDto {

    private String email;
    private String password;
}