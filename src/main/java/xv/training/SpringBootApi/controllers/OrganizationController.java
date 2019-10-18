package xv.training.SpringBootApi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xv.training.SpringBootApi.entities.Organization;
import xv.training.SpringBootApi.repositories.OrganizationRepository;

@RestController
public class OrganizationController {
	
	@Autowired
	private OrganizationRepository organizationRepository;

	@RequestMapping("/organizations")
	public Iterable<Organization> getOrganizations(){
		return organizationRepository.findAll();
		
	}
	
	@RequestMapping("/test")
	public String test(){
		return "test";
		
	}
	
}
