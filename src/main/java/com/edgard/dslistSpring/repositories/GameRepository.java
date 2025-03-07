package com.edgard.dslistSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edgard.dslistSpring.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
