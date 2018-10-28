package com.mystoremanager.service.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Document(collection = "user")
public class User {
    @Id
    String id;
    @NotNull
    String username;
    @NotNull
    String password;

    @Override
    public String toString() {
        return "{" +
                "id:'" + id + '\'' +
                ", username:'" + username + '\'' +
                ", password:'" + password + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
