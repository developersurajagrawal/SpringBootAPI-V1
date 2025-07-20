package com.cscorner.demo.controller;

import java.util.List;


import com.cscorner.demo.model.User;
import com.cscorner.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/about")
    public String aboutUs(Model model) {
        List<User> users = userRepository.findAll(); // Get from DB
        model.addAttribute("userList", users);
        return "about-us";
    }
    @GetMapping("/user-list")
    public String userUs(Model model) {
        List<User> users = userRepository.findAll(); // Get from DB
        model.addAttribute("userList", users);
        return "user-list";
    }
}
