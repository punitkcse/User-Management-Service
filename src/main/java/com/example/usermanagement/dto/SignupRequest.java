package com.example.usermanagement.dto;

import com.example.usermanagement.entity.User;

public class SignupRequest {
    private String email;
    private String password;
    private User.Role role = User.Role.USER;

    public SignupRequest() {}

    public SignupRequest(String email, String password, User.Role role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public User.Role getRole() { return role; }
    public void setRole(User.Role role) { this.role = role; }
}