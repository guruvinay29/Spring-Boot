package org.studyeasy.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.studyeasy.model.Alien;
import org.studyeasy.model.dao.AlienRepo;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@RestController
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		
		return "home.jsp";
		
	}
	@PostMapping("/aliens")
	public Alien addAlien(@RequestBody Alien alien) {
		
		repo.save(alien);
		return alien;
		
	}
	@PutMapping("/aliens")
	public Alien saveOrUpdateAlien(@RequestBody Alien alien) {
		
		repo.save(alien);
		return alien;
		
	}
	
	@DeleteMapping("/aliens/{aid}")
	public String deleteAlien(@PathVariable int aid) {
		
		Alien a = repo.getOne(aid);
		return "deleted";
		
	}
	
	@GetMapping( "/aliens")
	public List<Alien> getAliens() {
		
		return repo.findAll();
				
		//System.out.println(repo.findByTech("java"));
		//System.out.println(repo.findByAidGreaterThan(102));
		//System.out.println(repo.findByTechSorted("java"));
	}
	@RequestMapping("/aliens/{aid}")
	public java.util.Optional<Alien> getAlien(@PathVariable("aid")int aid) {
		
		return repo.findById(aid);
	}
	
	
	
	/*@RequestMapping("/delAlien") 
	public String  delAlien(int aid) {
		repo.deleteById(aid);
		
		return "delete.jsp";	
	}*/
	
	

}
