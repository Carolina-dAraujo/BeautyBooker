package com.app.beautybooker.repository;

import com.app.beautybooker.model.RoleEnum;
import com.app.beautybooker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByRole(RoleEnum role);
    Optional<User> findByEmail(String email);
}

