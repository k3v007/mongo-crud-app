package com.demo.mongocrudapp.entity.base;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

/**
 * @author Vivek Kumar Sinha
 */
@Getter
@Setter
public abstract class BaseDocument {

    @Id
    @Field("_id")
    protected ObjectId id;

    @CreatedDate
    @Field("created_at")
    protected LocalDateTime createdAt;

    @LastModifiedDate
    @Field("updated_at")
    protected LocalDateTime updatedAt;
}
