// File: src/main/java/com/cscorner/demo/repository/UserRepository.java
package com.cscorner.demo.repository;

import com.cscorner.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
