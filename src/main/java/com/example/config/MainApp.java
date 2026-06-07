package com.example.config;

import com.example.config.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApp {

    public static void main(String[] args) {
        //This creates Spring IoC Container and start spring container .
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        UserController controller = context.getBean(UserController.class);
        controller.createUser("Alice");
        controller.createUser("Bob");
        controller.listUser();
    }
}

//MainApp starts
//↓
//Spring Container created
//↓
//DatabaseConnection bean created
//↓
//init() called
//↓
//Repository bean created
//↓
//Service bean created
//↓
//Controller bean created
//↓
//createUser("Alice")
//↓
//User stored in list
//↓
//listUser()
//↓
//[Alice] displayed
//↓
//context.close()
//↓
//cleanup() called