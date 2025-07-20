// File: src/main/java/com/cscorner/demo/controller/UserController.java
package com.cscorner.demo.controller;

import com.cscorner.demo.model.User;
import com.cscorner.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

    @PostMapping
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }

	@GetMapping("/about")
    public String aboutUs() {
        return "about-us"; // Maps to about-us.jsp
    }
}


