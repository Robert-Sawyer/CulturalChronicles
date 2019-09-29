package com.github.robertsawyer.CulturalChronicles.domain.repositories;

import com.github.robertsawyer.CulturalChronicles.domain.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {


}
