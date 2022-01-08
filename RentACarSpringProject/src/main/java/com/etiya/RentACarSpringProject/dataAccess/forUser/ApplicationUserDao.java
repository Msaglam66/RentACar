package com.etiya.RentACarSpringProject.dataAccess.forUser;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.etiya.RentACarSpringProject.entities.ApplicationUser;

public interface ApplicationUserDao extends JpaRepository<ApplicationUser, Integer> {
	
	@Query("Select email From ApplicationUser")
	List<String> findAllEmail();

	@Query("Select password From ApplicationUser where email = :email ")
	String getPasswordByEmail(String email);

	boolean existsByEmail(String email);
}
