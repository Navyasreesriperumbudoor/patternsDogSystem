package com.navyaClasses.DMS.repository;

/**
* @author S567092 Navya Sree 

*/

import org.springframework.data.repository.CrudRepository;


import com.navyaClasses.DMS.Models.Trainer;

public interface TrainerRepository extends CrudRepository<Trainer, Integer>  {
	
	

}
