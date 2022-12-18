package com.ybigta.trenbien.service;

import com.ybigta.trenbien.domain.document.TestDoc;
import com.ybigta.trenbien.domain.repository.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    private TestRepo testRepo;

    public List<TestDoc> getTestList() {
        return testRepo.findAll();
    }

    public long getTestCount() {
        return testRepo.count();
    }
}
