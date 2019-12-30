package com.github.robertsawyer.CulturalChronicles.domain.repositories;

import com.github.robertsawyer.CulturalChronicles.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String name);

    Optional<User> findFirstByUsername(String username);

    Optional<User> findByLogin(String login);
}
