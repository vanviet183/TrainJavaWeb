package com.trainb1.trainb1.controllers;

import com.trainb1.trainb1.dtos.UserDto;
import com.trainb1.trainb1.entities.User;
import com.trainb1.trainb1.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getList() {
        return userService.getList();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable(name = "id") Long id) {
        return userService.getUser(id);
    }

    @PostMapping("")
    public User addNew(@RequestBody UserDto userDto) {
        return userService.addNew(userDto);
    }

    @PatchMapping("/users/{id}")
    public User updateUSer(@RequestBody UserDto userDto, @PathVariable("id") Long id) {
        return userService.update(userDto, id);
    }

    @DeleteMapping("/users/{id}")
    public String delete(@PathVariable("id") Long id) {
        return userService.delete(id);
    }

}
