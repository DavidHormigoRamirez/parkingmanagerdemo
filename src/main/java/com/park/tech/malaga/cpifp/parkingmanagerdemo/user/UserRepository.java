package com.park.tech.malaga.cpifp.parkingmanagerdemo.user;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {


    public List<User> getAll() {

        //TODO : Eliminar este codigo
        ArrayList<User> users= new ArrayList<>();
        users.add(new User("david", "hormigo", "Ramirez", "Profesor"));
        return users;

    }
    
}
