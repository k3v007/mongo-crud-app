package com.demo.mongocrudapp.dao;

import java.util.List;
import java.util.Optional;

/**
 * @author Vivek Kumar Sinha
 */
public interface Dao<T, ID> {

    Optional<T> get(ID id);

    T save(T t);

    List<T> saveAll(List<T> tList);

    void delete(T t);
}
