package com.intellibyte.smartcontacts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intellibyte.smartcontacts.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
