package com.produtos.apiRest.controller;

import java.util.List;

import com.produtos.apiRest.models.Users;
import com.produtos.apiRest.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public List<Users> listaUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Users findUser(@PathVariable(value = "id") long id) {
        return userRepository.findById(id).get();
    }

    @PostMapping
    public Users saveUser(@RequestBody Users user) {
        return userRepository.save(user);
    }

    @PutMapping
    public Users updateUsers(@RequestBody Users user) {
        return userRepository.save(user);
    }

    @DeleteMapping
    public void deleteUser(@RequestBody Users users) {
        userRepository.delete(users);
    }

}
