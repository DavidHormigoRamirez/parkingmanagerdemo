package com.park.tech.malaga.cpifp.parkingmanagerdemo.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    ArrayList<User> users;

    
    public UserRepository() {
        this.users = new ArrayList<>();
    }
    
    public List<User> getAll() {

        return users;

    }

    public void add(User user) {
        this.users.add(user);
    }
    
}
