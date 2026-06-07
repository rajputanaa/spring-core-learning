package com.example.config.repository;

import com.example.config.db.DatabaseConnection;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository                                             //Marks this class as DAO/Database Layer.
public class UserRepository {

    private DatabaseConnection db;

    public UserRepository(DatabaseConnection db) {    //Spring automatically injects it.This is Constructor Injection.
        this.db = db;
    }

    public List<String> findAll(){                  //Fetches all users.
        return db.getUsers();
    }

    public void save(String user){                  //Delegates work to database class.
        db.addUser(user);
    }
}
