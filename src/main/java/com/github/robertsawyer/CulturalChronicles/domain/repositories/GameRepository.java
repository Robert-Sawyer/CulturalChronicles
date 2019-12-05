package com.github.robertsawyer.CulturalChronicles.domain.repositories;

import com.github.robertsawyer.CulturalChronicles.domain.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GameRepository extends JpaRepository<Game, Long> {


    @Query(value = "SELECT * FROM games WHERE title = ?",
    nativeQuery = true)
    Game findByGameTitle(String title);
}
