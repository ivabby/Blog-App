package com.blogapp.controllers;

import com.blogapp.payloads.UserDto;
import com.blogapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // POST - Create User
    @PostMapping("/")
    public ResponseEntity<UserDto> createUser(@RequestBody  UserDto userDto) {
        userDto = userService.createUser(userDto);
        return new ResponseEntity<>(userDto , HttpStatus.CREATED);
    }

    //  PUT - Update User
//    @PutMapping("/{userId}")

    //  Delete - Delete User

    //  Get - Get User

    //  Get - Get All User
}
