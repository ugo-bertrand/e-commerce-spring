package com.example.ecommerce.user;

public class User {

    private Long id;
    private String name;
    private String firstname;
    private String address;
    public User(){

    }

    public User(Long id, String name, String firstname, String address){
        this.id = id;
        this.name = name;
        this.firstname = firstname;
        this.address = address;
    }

    public User(String name, String firstname, String address){
        this.name = name;
        this.firstname = firstname;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
