package com.server.hng;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("backend/gng/api/users")
public class UserController {

    //DATABASE
    private static final List<User> USERS = List.of(
            new User("Peacemaker", true, 28, "I am Software Engineer"),
            new User("Kwesi", true, 28, "I am Software Engineer"),
            new User("Agnes", true, 28, "I am Software Engineer")
    );

    @GetMapping()
    public static List<User> getUser() {
        return USERS;
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
