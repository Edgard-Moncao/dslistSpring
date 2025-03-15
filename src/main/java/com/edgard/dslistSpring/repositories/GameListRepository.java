package com.edgard.dslistSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edgard.dslistSpring.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
