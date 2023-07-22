package com.example.UserManagement.configuration;


import com.example.UserManagement.model.Type;
import com.example.UserManagement.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanManager {

    @Bean
    public List<User> getInitializedList()
    {
        User initUser = new User(0,"Raj","Raj@gmail.com","abed","9898989898",26, LocalDate.of(1996,12,12), Type.ADMIN);
        List<User> initList = new ArrayList<>();
        initList.add(initUser);

        return initList;
    }
}
