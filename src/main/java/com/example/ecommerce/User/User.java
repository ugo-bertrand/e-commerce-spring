package com.example.ecommerce.User;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document("User")
public class User {
    @Id
    private String id;
    private String username;
    private String firstname;
    private String lastname;
    private String password;
    private String email;
    private LocalDate dateOfBirth;
    private boolean active;

    //CONSTRUCTOR

    public User(){

    }
    public User(String id, String username, String firstname, String lastname, String password, String email, LocalDate dateOfBirth, boolean active){
        this.id = id;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.active = active;
    }

    public User(String username, String firstname, String lastname, String password, String email, LocalDate dateOfBirth){
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.active = Boolean.TRUE;
    }

    // GETTER AND SETTER


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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
