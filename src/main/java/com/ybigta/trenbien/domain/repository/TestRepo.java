package com.ybigta.trenbien.domain.repository;

import com.ybigta.trenbien.domain.document.TestDoc;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TestRepo extends MongoRepository<TestDoc, String> {

    List<TestDoc> findAll();
}
