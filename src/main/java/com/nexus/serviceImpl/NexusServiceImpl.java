package com.nexus.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexus.bean.NexusEmploye;
import com.nexus.exception.NexusException;
import com.nexus.repository.NexusRepository;
import com.nexus.service.NexusService;




@Service 
public class NexusServiceImpl implements NexusService{
	@Autowired
private NexusRepository nexusRepository;

@Override
	public void saveNexusEmploye(Integer id, String name, Integer age, Long mobino, String email, String password,
			String location, String dept, Integer salary) {
		// TODO Auto-generated method stub
		NexusEmploye nexemp=new NexusEmploye();
		nexemp.setId(id);
		nexemp.setName(name);
		nexemp.setAge(age);
		nexemp.setMobino(mobino);
		nexemp.setEmail(email);
		nexemp.setPassword(password);
		nexemp.setLocation(location);
		nexemp.setIs_active(true);
		nexemp.setDept(dept);
		nexemp.setSalary(salary);
	nexusRepository.save(nexemp);	
		
	}

@Override
public NexusEmploye findAllEmployeById(Integer id) throws NexusException {

	Optional<NexusEmploye> employeoptional = nexusRepository.findById(id);
	if (!employeoptional.isPresent()) {
		throw new NexusException("user details not found");
	}
	NexusEmploye nexusEmploye = employeoptional.get();

	return nexusEmploye;

}
@Override 
	public void deactivateNexusEmploye(integer id){
		Optional<NexusEmploye> nexusEmplOPtional=nexusRepository.findById(id);
		if(nexusEmplOPtional.isPresent()){
		NexusEmploye nexemp=nexusEmplOPtional.get();
		nexusRepository.save(nexemp);
		}
	}
}

	


