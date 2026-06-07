package com.example.config;

import com.example.config.db.DatabaseConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example")
public class AppConfig {

    @Bean(initMethod = "init" , destroyMethod = "cleanUp")     //This manually creates a bean.

    //init() is called After object creation , "cleanup() When container closes
    public DatabaseConnection dbConnection(){              //This simulates a database.
        return new DatabaseConnection();
    }
}
