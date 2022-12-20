package com.ybigta.trenbien.controller;

import com.ybigta.trenbien.domain.document.PostDoc;
import com.ybigta.trenbien.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.List;


@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @GetMapping("/Home")
    public List<PostDoc> getAllPost(){
        List<PostDoc> postList = postService.getPostList();
        return postList;
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @PostMapping("/Near")
    public List<PostDoc> getNearTrend(){
        return new ArrayList<>();
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @GetMapping("/District")
    public List<PostDoc> getDistrictTrend(){
        return new ArrayList<>();
    }
}
