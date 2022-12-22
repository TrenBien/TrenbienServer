package com.ybigta.trenbien.service;

import com.ybigta.trenbien.domain.entity.Trend;
import com.ybigta.trenbien.domain.entity.dto.TrendDto;
import com.ybigta.trenbien.domain.entity.dto.TrendLongLatDto;
import com.ybigta.trenbien.domain.repository.TrendRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrendService {

    @Autowired
    private TrendRepo trendRepo;

    public long getCount(){
        return trendRepo.count();
    }

    public List<Trend> findAllTrend() {
        return trendRepo.findAll();
    }

    public List<Trend> findTop50ByOrderByScoreDesc() {
        return trendRepo.findTop50ByOrderByScoreDesc();
    }

    public List<Trend> findAllWhereCategory(String category){
        return trendRepo.findAllWhereCategory(category);
    }
    public List<TrendDto> findNByOrderByScoreDescDto(Pageable pageable){
        return trendRepo.findNByOrderByScoreDescDto(pageable);
    }

    public List<TrendDto> findNWhereCategoryByOrderByScoreDescDto(Pageable pageable, String category){
        return trendRepo.findNWhereCategoryByOrderByScoreDescDto(pageable, category);
    }
    public List<TrendDto> findNWhereDistrictByOrderByScoreDescDto(Pageable pageable, Integer districtNum){
        return trendRepo.findNWhereDistrictByOrderByScoreDescDto(pageable, districtNum);
    }

    public List<TrendLongLatDto> findNByOrderByScoreDescLongLatDto(Pageable pageable, Integer districtNum){
        return trendRepo.findNByOrderByScoreDescLongLatDto(pageable, districtNum);
    }
}
