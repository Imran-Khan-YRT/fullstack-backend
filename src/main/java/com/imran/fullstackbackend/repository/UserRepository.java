package com.imran.fullstackbackend.repository;

import com.imran.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
