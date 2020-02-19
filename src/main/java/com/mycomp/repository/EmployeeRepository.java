package com.mycomp.repository;

import com.mycomp.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    @Transactional(readOnly = true)
    Optional<Employee> findByName(String name);

}
