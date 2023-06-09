package com.expert.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expert.dsmovie.entities.Score;
import com.expert.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	
}
