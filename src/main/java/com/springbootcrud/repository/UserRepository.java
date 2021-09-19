package com.springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springbootcrud.entity.user;

public interface UserRepository extends JpaRepository<user, Integer> {
	
	@Query("select u from user u where u.username=:username")
	public user getUserByUsername(@Param("username") String username);

}
