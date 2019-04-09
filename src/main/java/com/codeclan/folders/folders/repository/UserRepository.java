package com.codeclan.folders.folders.repository;

import com.codeclan.folders.folders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
