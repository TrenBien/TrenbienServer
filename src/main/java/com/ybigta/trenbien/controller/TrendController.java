package com.ybigta.trenbien.controller;

import com.ybigta.trenbien.domain.entity.dto.TrendDto;
import com.ybigta.trenbien.domain.entity.dto.TrendLongLatDto;
import com.ybigta.trenbien.request.GpsCoordinate;
import com.ybigta.trenbien.service.TrendService;
import com.ybigta.trenbien.util.Distance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

@Controller
public class TrendController {
    @Autowired
    private TrendService trendService;

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @GetMapping("/Home/{num}")
    public List<TrendDto> get50Trend(@PathVariable Integer num){ //0전체 1 카페 2음식 3놀거리
        List<TrendDto> trendDtoList = new ArrayList<>();
        switch (num){
            case 0:
                trendDtoList = trendService.findNByOrderByScoreDescDto(PageRequest.of(0,50));
                break;
            case 1:
                trendDtoList = trendService.findNWhereCategoryByOrderByScoreDescDto(PageRequest.of(0,50), "카페");
                break;
            case 2:
                trendDtoList = trendService.findNWhereCategoryByOrderByScoreDescDto(PageRequest.of(0,50), "음식");
                break;
            case 3:
                trendDtoList = trendService.findNWhereCategoryByOrderByScoreDescDto(PageRequest.of(0,50), "놀거리");
                break;
            default:
        }

        return trendDtoList;
    }
    //near 구현
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @PostMapping("/Near")
    //위도 경도 값 받기
    public List<TrendLongLatDto> get20NearTrend(@RequestBody GpsCoordinate gpsCoordinate){
        long trendCount = trendService.getCount();
        Integer trendSize = (int) Math.round(trendCount / 4);
        List<TrendLongLatDto> trendLongLatDtoList = trendService.findNByOrderByScoreDescLongLatDto(PageRequest.of(0,trendSize), gpsCoordinate.getDistrictNum());
        Float myLatitude = gpsCoordinate.getLatitude();
        Float myLongitude = gpsCoordinate.getLongitude();
        PriorityQueue<TrendLongLatDto> priorityQueue = new PriorityQueue<>();
        for (TrendLongLatDto trendLongLatDto : trendLongLatDtoList){
            Float trendLatitude = trendLongLatDto.getLatitude();
            Float trendLongitude = trendLongLatDto.getLongitude();
            Integer distance = Distance.getDistanceFromLatAndLong(myLatitude, myLongitude, trendLatitude, trendLongitude);
            if (distance != null){
                trendLongLatDto.setDistance(distance);
                priorityQueue.add(trendLongLatDto);
            }
        }
        List<TrendLongLatDto> resultTrendLongLatDtoList = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            if (priorityQueue.isEmpty()){
                break;
            }
            resultTrendLongLatDtoList.add(priorityQueue.poll());
        }
        return resultTrendLongLatDtoList;
    }


    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @GetMapping("/District/{districtNum}")
    public List<TrendDto> get20DistrictTrend(@PathVariable Integer districtNum){
        List<TrendDto> trendDtoList = trendService.findNWhereDistrictByOrderByScoreDescDto(PageRequest.of(0,20), districtNum);
        return trendDtoList;
    }
}

