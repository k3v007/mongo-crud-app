package com.demo.mongocrudapp.dao;

import com.demo.mongocrudapp.entity.Employee;
import com.demo.mongocrudapp.repository.mongo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * @author Vivek Kumar Sinha
 */
@Component
public class EmployeeDao implements Dao<Employee, String> {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeDao(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Optional<Employee> get(String id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> saveAll(List<Employee> employees) {
        return employeeRepository.saveAll(employees);
    }

    @Override
    public void delete(Employee employee) {
        employeeRepository.delete(employee);
    }
}
