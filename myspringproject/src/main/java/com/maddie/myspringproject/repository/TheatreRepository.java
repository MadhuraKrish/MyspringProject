package com.maddie.myspringproject.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maddie.myspringproject.model.Theatre;

public interface TheatreRepository extends JpaRepository<Theatre, Integer>{
//	List<Theatre> findAllByOrderByReleaseDateDesc();
}
