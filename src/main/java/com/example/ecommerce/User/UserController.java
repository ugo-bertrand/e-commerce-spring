package com.example.ecommerce.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController()
@RequestMapping("api/users")
public class UserController {

    @GetMapping("/")
    public List<User> getAllUser(){
        return List.of(
                new User(1L,"test_username","testfirstname","testlastname","password","test@gmail.com", LocalDate.of(2002, Month.MAY,25),true),
                new User(1L,"test_username2","testfirstname2","testlastname2","password","test2@gmail.com", LocalDate.of(2002,Month.MAY,25),true)
        );
    }



}
