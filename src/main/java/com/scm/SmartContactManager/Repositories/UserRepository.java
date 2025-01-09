package com.scm.SmartContactManager.Repositories;

import com.scm.SmartContactManager.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
