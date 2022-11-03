package com.example.UserDetails.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.UserDetails.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
	

}
