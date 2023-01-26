package com.park.tech.malaga.cpifp.parkingmanagerdemo.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public class UserRepository {


    private ArrayList<User> usuarios;
    public UserRepository() {
        usuarios = new ArrayList<>();
    }
    public List<User> getAll() {
        this.usuarios.clear();
        this.usuarios.add(new User("dhorram948@g.educand.es","David Hormigo Ramirez"));
        this.usuarios.add(new User("otroemail","Alejandro"));
        return this.usuarios;
    }
    
}
