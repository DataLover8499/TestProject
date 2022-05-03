package com.example.movielibrary.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.movielibrary.model.Movie;
import com.example.movielibrary.service.MovieService;

public class MovieController {

	@Autowired
	MovieService service;
	
	
	@GetMapping("/all")
	public List<Movie> showAllMovie(){
		return service.getAllMovie();
	}
	
}
