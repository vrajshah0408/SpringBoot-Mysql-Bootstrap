package com.vrajcodes.fullstack.spring.boot.backend.repository;


import com.vrajcodes.fullstack.spring.boot.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
