package com.theironyard.services;

import com.theironyard.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by gilbertakpan on 1/3/17.
 */
public interface UserRespository extends CrudRepository<User, Integer> {
    User findFirstByName(String name);

}
