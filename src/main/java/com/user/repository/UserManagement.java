package com.user.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserManagement extends JpaRepository<UserManagement,Serializable>{
}
