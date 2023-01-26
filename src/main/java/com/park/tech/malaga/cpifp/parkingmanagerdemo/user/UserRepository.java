package com.park.tech.malaga.cpifp.parkingmanagerdemo.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    ArrayList<User> users;

    public UserRepository() {
        // TODO : Eliminar este codigo
        this.users = new ArrayList<>();

    }

    public List<User> getAll() {
        // TODO : Eliminar este codigo
        this.users.clear();
        this.users.add(new User("David", "Hormigo", "Ramírez", "Profesor"));
        this.users.add(new User("Manolo", "González", "", "Alumno"));
        return this.users;
    }

}
