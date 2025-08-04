package com.sakshi.authProject.Repository;

import com.sakshi.authProject.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
   Optional<UserEntity>   findByEmail(String email);
}
