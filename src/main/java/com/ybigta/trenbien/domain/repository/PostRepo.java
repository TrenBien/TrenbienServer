package com.ybigta.trenbien.domain.repository;

import com.ybigta.trenbien.domain.document.PostDoc;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PostRepo extends MongoRepository<PostDoc, String> {

    List<PostDoc> findAll();

    long count();

}
