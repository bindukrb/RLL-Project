package com.cinema.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinema.entity.User;

@Repository("userRepository")
@Scope("singleton")
public interface UserRepository extends JpaRepository<User, Integer>{

}
