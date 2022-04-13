package com.nexus.service;

import com.nexus.bean.NexusEmploye;
import com.nexus.exception.NexusException;

public interface NexusService {

	

	void saveNexusEmploye(Integer id, String name, Integer age, Long mobino, String email, String password,
			String location, String dept, Integer salary);

	

	NexusEmploye findAllEmployeById(Integer id) throws NexusException;

	

		
	}

	


