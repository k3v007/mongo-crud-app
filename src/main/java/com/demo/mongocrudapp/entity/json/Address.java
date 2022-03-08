package com.demo.mongocrudapp.entity.json;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author Vivek Kumar Sinha
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Field("address_line")
    private String addressLine;

    @Field("city")
    private String city;

    @Field("state")
    private String state;

    @Field("pincode")
    private String pincode;
}
