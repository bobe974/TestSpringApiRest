package com.etienne.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.etienne.api.modele.Employee;

@Repository //indique que la classe est un bean, et que son rôle est de communiquer avec une source de données 
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	
}
