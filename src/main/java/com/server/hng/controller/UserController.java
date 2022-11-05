package com.server.hng.controller;


import com.server.hng.model.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("backend/gng/api/users")
public class UserController {

    //DATABASE
    private static final List<User> USERS = Stream.of(
            new User("Peacemaker", true, 28, "I am Software Engineer")
    ).toList();


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public static List<User> getUser() {
        return USERS.stream().toList();
    }

    @GetMapping(path = "{slackUserName}")
    public User getUserBySlackName(@PathVariable("slackUserName") String slackUserName) {
        return USERS
                .stream()
                .filter(user -> slackUserName.equals(user.getSlackUsername()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("user" + slackUserName + "Not found"));
    }
}
