package com.demo.mongocrudapp.repository;

import com.demo.mongocrudapp.entity.Employee;
import com.demo.mongocrudapp.entity.json.Address;
import com.demo.mongocrudapp.repository.mongo.EmployeeRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Vivek Kumar Sinha
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void testFindEmployeeByEmployeeCode() {
        Employee employee = employeeRepository.findFirstByEmployeeCode("EMP001");
        Assertions.assertThat(employee)
                .isNotNull();
        Assertions.assertThat(employee.getEmployeeCode())
                .isEqualTo("EMP001");
    }

    @Test
    void testAddEmployee() {
        Employee employee =
                Employee.builder()
                        .name("Test User XXX")
                        .employeeCode(RandomStringUtils.randomAlphabetic(6).toUpperCase())
                        .dateOfBirth(LocalDate.of(1999, 1, 1))
                        .address(
                                Address.builder()
                                        .addressLine("Test Lane 1")
                                        .city("Test City")
                                        .state("Test State")
                                        .pincode("000000")
                                        .build())
                        .build();
        employee = employeeRepository.save(employee);
        Assertions.assertThat(employee.getId())
                .isNotNull();
        Assertions.assertThat(employee.getName())
                .isEqualTo("Test User XXX");
    }

    @Test
    void testUpdateEmployee() {
        String newName = "Test Admin";
        String employeeCode = "ZIDGHQ";
        Employee employee = employeeRepository.findFirstByEmployeeCode(employeeCode);
        if (Objects.nonNull(employee)) {
            employee.setName(newName);
        }
        employee = employeeRepository.save(employee);
        Assertions.assertThat(employee)
                .isNotNull();
        Assertions.assertThat(employee.getName())
                .isNotNull()
                .isEqualTo(newName);
    }
}
