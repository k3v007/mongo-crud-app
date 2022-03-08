package com.demo.mongocrudapp.service;

import com.demo.mongocrudapp.dao.EmployeeDao;
import com.demo.mongocrudapp.repository.mongo.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author Vivek Kumar Sinha
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
class EmployeeDaoTest {

    @MockBean
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testFindEmployeeByEmployeeCode() {
    }
}
