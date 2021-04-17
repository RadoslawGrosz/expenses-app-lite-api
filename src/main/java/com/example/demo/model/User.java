package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
    @Id
    private ObjectId _id;
    private String username;
    private String password;
    private String role;

    public User(@JsonProperty("id") ObjectId _id,
                @JsonProperty("username") String username,
                @JsonProperty("password") String password,
                @JsonProperty("role") String role) {
        this._id = _id;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String get_id() { return this._id.toHexString(); }

    public void set_id(ObjectId _id) {
        this._id = _id;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    //    public String getPassword() { return this.password; }
//
//    public String getUsername() { return this.username; }
//
//    public String getRole() {
//        return this.role;
//    }
//
//    public void set_id(ObjectId _id) {
//        this._id = _id;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
}