package com.example.config.db;

import java.util.ArrayList;
import java.util.List;


public class DatabaseConnection {

    private List<String> users;                   //Stores user data temporarily.

    public void init(){                           //Runs automatically after bean creation.

        users = new ArrayList<>();
        System.out.println("db Connected (Simulated)");
    }

    public List<String> getUsers(){                //Returns all users.
        return users;
    }

    public void addUser(String user){              //Adds user to list.
        users.add(user);
    }

    public void cleanUp(){                          //Runs when Spring container closes.
        System.out.println("DB Disconnected (Simulated)");
    }

}
