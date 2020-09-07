package com.MvcProject.LoginMicroservice.model;

import org.springframework.data.jpa.repository.JpaRepository;


/* 
 this interface Interacts With database.
 */

public interface UserRepo extends JpaRepository<User, Integer>{


}
