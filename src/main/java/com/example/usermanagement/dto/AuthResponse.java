package com.example.usermanagement.dto;

import com.example.usermanagement.entity.User;

public class AuthResponse {
    private String token;
    private String email;
    private User.Role role;

    public AuthResponse() {}

    public AuthResponse(String token, String email, User.Role role) {
        this.token = token;
        this.email = email;
        this.role = role;
    }

    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public User.Role getRole() { return role; }
    public void setRole(User.Role role) { this.role = role; }
}