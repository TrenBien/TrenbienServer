package com.ybigta.trenbien.controller;

import com.ybigta.trenbien.domain.document.PostDoc;
import com.ybigta.trenbien.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;


@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @GetMapping("/list")
    public List<PostDoc> getAllPost(){
        List<PostDoc> testDocList = postService.getPostList();
        return testDocList;
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @GetMapping("/list/count")
    public long getPostCount(){
        return postService.getPostCount();
    }
}
