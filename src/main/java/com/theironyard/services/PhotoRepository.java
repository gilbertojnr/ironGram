package com.theironyard.services;

import com.theironyard.entities.Photo;
import com.theironyard.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by gilbertakpan on 1/3/17.
 */
public interface PhotoRepository extends CrudRepository<Photo, Integer> {
    List<Photo> findByRecipient(User receiver);
    List<Photo> findBySenderAndIsPublic(User sender, boolean isPublic);

}
