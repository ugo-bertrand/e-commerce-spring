package com.example.ecommerce.User;

import com.example.ecommerce.Exception.BadRequestException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public void createUser(User user){
        Optional<User> userOptional = userRepository.findItemByEmail(user.getEmail());
        if(userOptional.isPresent()){
            throw new IllegalStateException("The email address " + user.getEmail() + " already exists");
        }
        userRepository.save(user);
    }

    public void getUserById(){
        //todo
    }

    public void updateUser(){
        //todo
    }

    public void deleteUser(){
        //todo
    }

}
