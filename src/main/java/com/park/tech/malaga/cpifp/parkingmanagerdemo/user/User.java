package com.park.tech.malaga.cpifp.parkingmanagerdemo.user;

public class User {
    
    private long id;
    private String email;
    private String name;

    public User(String email, String name){
        this.email =  email;
        this.name = name;
    }

    public long getId(){
        return this.id;
    }

    public String getEmail() {
        return this.email;
    }

    public String getName() {
        return this.name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }


}
