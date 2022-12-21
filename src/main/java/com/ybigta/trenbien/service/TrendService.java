package com.ybigta.trenbien.service;

import com.ybigta.trenbien.domain.entity.Trend;
import com.ybigta.trenbien.domain.entity.dto.TrendDto;
import com.ybigta.trenbien.domain.repository.TrendRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrendService {

    @Autowired
    private TrendRepo trendRepo;

    public List<Trend> findAllTrend() {
        return trendRepo.findAll();
    }

    public List<Trend> findTop50ByOrderByScoreDesc() {
        return trendRepo.findTop50ByOrderByScoreDesc();
    }

    public List<TrendDto> findNByOrderByScoreDescDto(Pageable pageable){
        return trendRepo.findNByOrderByScoreDescDto(pageable);
    }
}
