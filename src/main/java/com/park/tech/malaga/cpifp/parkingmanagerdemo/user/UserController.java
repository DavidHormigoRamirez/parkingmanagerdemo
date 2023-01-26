package com.park.tech.malaga.cpifp.parkingmanagerdemo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    
    @Autowired
    private UserRepository repository;

    @GetMapping("/users")
    public String displayUsers(Model model) {
        model.addAttribute("users", repository.getAll());
        return "userlist";

    }
}
