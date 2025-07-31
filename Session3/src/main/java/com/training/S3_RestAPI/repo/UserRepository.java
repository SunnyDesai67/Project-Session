package com.training.S3_RestAPI.repo;

import com.training.S3_RestAPI.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByEmail(String email);

    @Query("SELECT u FROM User u WHERE u.username LIKE :character%")
    List<User> findUserStartingWithS(Character character);
}
