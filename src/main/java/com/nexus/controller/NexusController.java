package com.nexus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nexus.bean.NexusEmploye;
import com.nexus.exception.NexusException;
import com.nexus.service.NexusService;

@RestController
@RequestMapping("/nexusemp")
public class NexusController {
	@Autowired
private NexusService nexusService;
	@PostMapping("/save")
	public String saveNexusEmploye(@RequestParam Integer id,@RequestParam String name,@RequestParam Integer age,@RequestParam Long mobino,
			@RequestParam String email,@RequestParam String  password,@RequestParam String location,
			@RequestParam String dept,@RequestParam Integer salary) {
		nexusService.saveNexusEmploye(id,name,age,mobino,email,password,location,dept,salary);
				return "Sucess";
		
	}
	@GetMapping("/findbyid")
	public NexusEmploye findAllEmployeById(@RequestParam Integer id) throws NexusException {
		
		NexusEmploye nexusEmploye=nexusService.findAllEmployeById(id); 
		return nexusEmploye;
	}
	
	}
