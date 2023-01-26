package com.park.tech.malaga.cpifp.parkingmanagerdemo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    
    @Autowired
    private UserRepository repository;

    @GetMapping("/users")
    public String displayUsers(Model model) {
        model.addAttribute("users", repository.getAll());
        return "userList";

    }

    @GetMapping("/newUser")
    public String userForm(Model model) {
        model.addAttribute("user", new User());
        return "newUserForm";
    }

    @PostMapping("/newUser")
    public String createUser(@ModelAttribute User user,Model model) {
        model.addAttribute("user", user);
        repository.add(user);
        return "userList";
    }
}
