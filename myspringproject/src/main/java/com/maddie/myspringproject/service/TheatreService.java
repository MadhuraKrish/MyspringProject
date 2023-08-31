package com.maddie.myspringproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.maddie.myspringproject.model.Theatre;
import com.maddie.myspringproject.repository.TheatreRepository;

@Service
public class TheatreService {
	@Autowired
	TheatreRepository theatrerepository;
	
	public Theatre saveTheatre(Theatre theatre)
	{
		return theatrerepository.save(theatre);
	}
	public List<Theatre> showTheatre()
	{
		return theatrerepository.findAll();
	}
	public Theatre updateTheatre(Theatre theatre)
	{
		return theatrerepository.save(theatre);
	}
	public String updateTheatreId(int theatreId, Theatre theatre)
	{
		theatrerepository.save(theatre);
		if(theatrerepository.existsById(theatreId))
		{
			return "The values are updated";
		}
		else
		{
			return "Please enter the valid id";
		}
	}
	public void deleteTheatre(int theatreId)
	{
		theatrerepository.deleteById(theatreId);;
	}

	//sorting
		public List<Theatre> sortInfo(String s)
		{
			return theatrerepository.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
		}
		//pagination
		public List<Theatre> getbypage(int pgno,int pgsize)
		{
			Page<Theatre> p= theatrerepository.findAll(PageRequest.of(pgno, pgsize));
			return p.getContent();
		}
//		public List<Theatre> getAllMoviesSortedByReleaseDateDesc() {
//	        return theatrerepository.findAllByOrderByReleaseDateDesc();
//		}
}