package com.whereToWatch.WhereToWatch.controllers;

import com.whereToWatch.WhereToWatch.dto.UserData;
import com.whereToWatch.WhereToWatch.dto.UserResponse;
import com.whereToWatch.WhereToWatch.models.User;
import com.whereToWatch.WhereToWatch.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@CrossOrigin
public class
UserController {

    private ModelMapper modelMapper;
    UserService userService;

    @Autowired
    public UserController(ModelMapper modelMapper, UserService userService) {
        this.modelMapper = modelMapper;
        this.userService = userService;
    }


    @PostMapping("/signin")
    @ResponseStatus(HttpStatus.CREATED)
    public String login(//
                        @RequestParam String username, //
                        @RequestParam String password) {
        return userService.signin(username, password);
    }

    @PostMapping("/signup")
    @ResponseStatus(HttpStatus.CREATED)
    public String signup(@RequestBody UserData user) {
        return userService.signup(modelMapper.map(user, User.class));
    }

    @GetMapping(value = "/me")
    public UserResponse whoami(HttpServletRequest req) {
        return modelMapper.map(userService.whoami(req), UserResponse.class);
    }

}
