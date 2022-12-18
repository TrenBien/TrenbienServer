package com.ybigta.trenbien.service;

import com.ybigta.trenbien.domain.document.PostDoc;
import com.ybigta.trenbien.domain.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepo postRepo;

    public List<PostDoc> getPostList() {
        return postRepo.findAll();
    }

    public long getPostCount() {
        return postRepo.count();
    }
}