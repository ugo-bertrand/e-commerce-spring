package com.example.ecommerce.User;

import com.example.ecommerce.Exception.BadRequestException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController()
@RequestMapping("api/users")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @GetMapping("/")
    public List<User> getAllUser(){
        return userService.getAllUsers();
    }

    @PostMapping("/addUser")
    public ResponseEntity createUser(@RequestBody User user){
       try{
           log.info("Create of a new user in progress");
           if(user.getUsername().equals("") || user.getUsername() == null){
               log.error("An argument is missing (username is missing)");
               throw new BadRequestException("An argument is missing (username is missing)");
           }
           else if(user.getFirstname().equals("") || user.getFirstname() == null){
               log.error("An argument is missing (firstname is missing)");
               throw new BadRequestException("An argument is missing (firstname is missing)");
           }
           else if(user.getLastname().equals("") || user.getLastname() == null){
               log.error("An argument is missing (lastname is missing)");
               throw new BadRequestException("An argument is missing (lastname is missing)");
           }
           else if(user.getEmail().equals("") || user.getEmail() == null){
               log.error("An argument is missing (email is missing)");
               throw new BadRequestException("An argument is missing (email is missing)");
           }
           else if(user.getPassword().equals("") || user.getPassword() == null){
               log.error("An argument is missing (password is missing)");
               throw new BadRequestException("An argument is missing (password is missing)");
           }
           else if(user.getDateOfBirth().equals("") || user.getDateOfBirth() == null){
               log.error("An argument is missing (date of birth is missing)");
               throw new BadRequestException("An argument is missing (date of birth is missing");
           }
           else{
               userService.createUser(user);
               return ResponseEntity.status(HttpStatus.CREATED).body(user);
           }
       }
       catch(BadRequestException badRequestException){
            return ResponseEntity.status(HttpStatusCode.valueOf(badRequestException.getStatus())).body(badRequestException);
       }

    }

    @GetMapping()
    public void getUserById(Long id){
        //todo
    }

    @PutMapping()
    public void updateUser(Long id){
        //todo
    }

    @DeleteMapping()
    public void deleteUser(Long id){
        //todo
    }
}
