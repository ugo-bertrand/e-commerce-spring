package com.example.ecommerce.User;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, Long>{
    @Query("{'email' :  ?0}")
    Optional<User> findItemByEmail(String email);
}