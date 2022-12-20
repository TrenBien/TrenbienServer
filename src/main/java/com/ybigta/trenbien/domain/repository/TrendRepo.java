package com.ybigta.trenbien.domain.repository;

import com.ybigta.trenbien.domain.entity.Trend;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrendRepo extends JpaRepository<Trend, Long> {
    List<Trend> findAll();
    List<Trend> findTop50ByOrderByScoreDesc();
}
