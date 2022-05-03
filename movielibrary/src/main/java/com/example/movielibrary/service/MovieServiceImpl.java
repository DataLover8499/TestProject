package com.example.movielibrary.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.movielibrary.model.Movie;
import com.example.movielibrary.repo.MovieDao;

public class MovieServiceImpl {

	@Autowired
	MovieDao dao;

	public List<Movie> getAllMovie() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	
}
