package com.ybigta.trenbien.controller;

import com.ybigta.trenbien.domain.document.TestDoc;
import com.ybigta.trenbien.service.TestService;
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
    private TestService testService;

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @GetMapping("/list")
    public List<TestDoc> getAllPost(){
        List<TestDoc> testDocList = testService.getTestList();
        return testDocList;
    }
}
