package com.nexus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nexus.bean.NexusEmploye;

public interface NexusRepository extends JpaRepository< NexusEmploye,Integer>{

	

}
