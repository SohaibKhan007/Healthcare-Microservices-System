package com.pm.authservice.dto;

public class LoginResponseDTO {

    private String token;

    public LoginResponseDTO(String token) {
        this.token = token;
    }

    public String getTockeStringn() {
        return token;
    }
}
