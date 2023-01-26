package com.park.tech.malaga.cpifp.parkingmanagerdemo.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    ArrayList<User> users;

    //TODO : Eliminar este codigo
    public UserRepository() {
        this.users = new ArrayList<>();
        users.add(new User("david", "hormigo", "Ramirez", "Profesor"));
        users.add(new User("Manolo", "Perez", "Ramirez", "Alumno"));
    }
    
    public List<User> getAll() {

        return users;

    }

    public void save(User user) {
        this.users.add(user);
    }
    
}
