/**
* @author S567092 Navya Sree Sriperumbudoor

*/


package com.navyaClasses.DMS.repository;



import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.navyaClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);

}


