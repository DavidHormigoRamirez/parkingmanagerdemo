package com.park.tech.malaga.cpifp.parkingmanagerdemo.user;

public class User {

    private long id;
    private String firstName;
    private String lastName1;
    private String lastName2;
    private String role;

    public User(){
        this("","","","");
    }
    public User(String firstName, String lastName1, String lastName2, String role) {
        this.id = 0;
        this.firstName = firstName;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.role = role;
    }


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName1() {
        return lastName1;
    }


    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }


    public String getLastName2() {
        return lastName2;
    }


    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }


    public String getRole() {
        return role;
    }


    public void setRole(String role) {
        this.role = role;
    }


    public String getFullName() {
        return this.firstName + " " + this.lastName1 + " " + this.lastName2;
    }

}
