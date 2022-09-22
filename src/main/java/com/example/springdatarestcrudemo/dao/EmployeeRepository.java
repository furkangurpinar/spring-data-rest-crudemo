package com.example.springdatarestcrudemo.dao;


import com.example.springdatarestcrudemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//bu annotation endpoint'i belirler employees yerine members koyduk  @RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
//that's it ... no need to write any code