package com.sb.crudjunit;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

//No need to add @Repository as spring data jp internally provides @DataJpaRepository 
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	Optional<Employee> findByEmail(String email);//custom method to find by email
	
}

