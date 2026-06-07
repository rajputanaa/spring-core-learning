    package com.example.config.controller;

    import org.springframework.stereotype.Controller;
    import com.example.config.service.UserService;

    import java.util.List;

    @Controller                             //Marks presentation layer/controller layer.
    public class UserController {               //Handles user requests.
        private UserService userService;

        public UserController(UserService userService) {   //Constructor Injection
            this.userService = userService;
        }

        public void createUser(String name){                //Adds user.

            userService.addUser(name);
            System.out.println("User added : " +name);

        }

        public void listUser(){                         //Displays all users.
            List<String> users = userService.getAllUsers();
            System.out.println("All User: "+ users);
        }
    }
