package com.example.movielibrary.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.movielibrary.model.Movie;

@Repository
@Transactional
public interface MovieDao extends JpaRepository<Movie,Integer> {	
	
}
