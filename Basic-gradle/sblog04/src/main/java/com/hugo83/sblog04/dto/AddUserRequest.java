package com.hugo83.sblog04.dto;

import lombok.*;

@Setter
@Getter
public class AddUserRequest {
    private String email;
    private String password;
}