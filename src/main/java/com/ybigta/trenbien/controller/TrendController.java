package com.ybigta.trenbien.controller;

import com.ybigta.trenbien.domain.document.PostDoc;
import com.ybigta.trenbien.domain.entity.Trend;
import com.ybigta.trenbien.domain.entity.dto.TrendDto;
import com.ybigta.trenbien.service.TrendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Controller
public class TrendController {
    @Autowired
    private TrendService trendService;

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @GetMapping("/Home")
    public List<TrendDto> get50Trend(){
        List<TrendDto> trendTtoList = trendService.findNByOrderByScoreDescDto(PageRequest.of(0,50));
        return trendTtoList;
    }

}
