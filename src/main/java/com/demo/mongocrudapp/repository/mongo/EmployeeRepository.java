package com.demo.mongocrudapp.repository.mongo;

import com.demo.mongocrudapp.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Vivek Kumar Sinha
 */
@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {

    Employee findFirstByEmployeeCode(String employeeCode);
}
