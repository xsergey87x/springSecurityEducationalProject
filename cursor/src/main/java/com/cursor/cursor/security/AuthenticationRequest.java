package com.cursor.cursor.security;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AuthenticationRequest {

    private String email;
    private String password;
}