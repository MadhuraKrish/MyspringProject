package com.maddie.myspringproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.maddie.myspringproject.model.Theatre;
import com.maddie.myspringproject.service.TheatreService;

@RestController
public class TheaterController {
	@Autowired
	TheatreService theatreservice;
	
	@PostMapping("/save1")
	public Theatre saveTheTheatre(@RequestBody Theatre theatre)
	{
		return theatreservice.saveTheatre(theatre);
	}
	@GetMapping("/get1")
	public List<Theatre> showTheTheatre()
	{
		return theatreservice.showTheatre();
	}
	@PutMapping("/update1")
	public Theatre updateTheTheatre(@RequestBody Theatre theatre)
	{
		return theatreservice.updateTheatre(theatre);
	}
	@DeleteMapping("/delete1/{theatreId}")
	public void DeleteTheTheatre(@PathVariable int theatreId)
	{
		theatreservice.deleteTheatre(theatreId);
	}
	@PutMapping("update1/{theatreId}")
	public String updateTheTheatreId(@PathVariable int theatreId,@RequestBody Theatre theatre)
	{
		return theatreservice.updateTheatreId(theatreId,theatre);
	}

	@GetMapping("paging/{pageno}/{pagesize}")
	public List<Theatre> showpageinfo(@PathVariable int pageno,@PathVariable int pagesize)
	{
		return theatreservice.getbypage(pageno,pagesize);
	}
	//sorting
	@GetMapping("sort/{name}")
	public List<Theatre> sortTheinfo(@PathVariable String name)
	{
		return theatreservice.sortInfo(name);
	}
//	 @GetMapping("sorted/desc")
//	    public ResponseEntity<List<Theatre>> getAllMoviesSortedDesc() {
//	        List<Theatre> sortedMovies = theatreservice.getAllMoviesSortedByReleaseDateDesc();
//	        return ResponseEntity.ok(sortedMovies);
//	 }
}
