package com.sreenu.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sreenu.demo.binding.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
