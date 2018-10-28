package com.mystoremanager.service.controllers;

import com.mystoremanager.service.configuration.MongoConfiguration;
import com.mystoremanager.service.dao.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    MongoConfiguration mongoConfiguration;

    @PostMapping("/add")
    public ResponseEntity<String> addUser(@RequestBody User user) throws Exception {
        mongoConfiguration.mongoTemplate().save(user);
        return new ResponseEntity<>(user.toString(), HttpStatus.OK);
    }
}
