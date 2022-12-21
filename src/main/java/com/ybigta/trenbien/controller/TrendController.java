package com.ybigta.trenbien.controller;

import com.ybigta.trenbien.domain.entity.dto.TrendDto;
import com.ybigta.trenbien.domain.entity.dto.TrendLongLatDto;
import com.ybigta.trenbien.service.TrendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
        List<TrendDto> trendDtoList = trendService.findNByOrderByScoreDescDto(PageRequest.of(0,50));
        return trendDtoList;
    }

    //near 구현
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @GetMapping("/Near")
    public List<TrendLongLatDto> get20NearTrend(){
        List<TrendLongLatDto> trendLongLatDtoList = trendService.findNByOrderByScoreDescLongLatDto(PageRequest.of(0,20));
        return trendLongLatDtoList;
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @GetMapping("/District/{districtNum}")
    public List<TrendDto> get20DistrictTrend(@PathVariable Integer districtNum){
        List<TrendDto> trendDtoList = trendService.findNWhereDistrictByOrderByScoreDescDto(PageRequest.of(0,20), districtNum);
        return trendDtoList;
    }
}

