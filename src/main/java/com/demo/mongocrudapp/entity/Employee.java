package com.demo.mongocrudapp.entity;

import com.demo.mongocrudapp.entity.base.BaseDocument;
import com.demo.mongocrudapp.entity.json.Address;
import com.demo.mongocrudapp.enums.DesignationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;

/**
 * @author Vivek Kumar Sinha
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "employees")
public class Employee extends BaseDocument {

    @Field("name")
    private String name;

    @Field("employee_code")
    private String employeeCode;

    @Field("designation")
    private DesignationType designation;

    @Field("date_of_birth")
    private LocalDate dateOfBirth;

    @Field("address")
    private Address address;
}
