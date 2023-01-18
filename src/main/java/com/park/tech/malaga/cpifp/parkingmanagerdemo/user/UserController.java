package com.park.tech.malaga.cpifp.parkingmanagerdemo.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    

    private UserRepository repository = new UserRepository();

    @GetMapping("/users")
    public String displayUsers() {

        return "";

    }
}
