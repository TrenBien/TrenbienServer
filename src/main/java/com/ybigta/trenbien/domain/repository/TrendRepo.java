package com.ybigta.trenbien.domain.repository;

import com.ybigta.trenbien.domain.entity.Trend;
import com.ybigta.trenbien.domain.entity.dto.TrendDto;
import com.ybigta.trenbien.domain.entity.dto.TrendLongLatDto;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrendRepo extends JpaRepository<Trend, Long> {
    long count();

    List<Trend> findAll();

    @Query("SELECT t FROM Trend t WHERE t.category = :category")
    List<Trend> findAllWhereCategory(@Param("category") String category);

    List<Trend> findTop50ByOrderByScoreDesc();

    @Query("SELECT new com.ybigta.trenbien.domain.entity.dto.TrendDto(t.name, t.category, t.detailedAddress, t.placeUrl, t.imageUrl,  t.tag1, t.tag2) FROM Trend t ORDER BY t.score DESC")
    List<TrendDto> findNByOrderByScoreDescDto(Pageable pageable);

    @Query("SELECT new com.ybigta.trenbien.domain.entity.dto.TrendDto(t.name, t.category, t.detailedAddress, t.placeUrl, t.imageUrl,  t.tag1, t.tag2) FROM Trend t WHERE t.category = :category ORDER BY t.score DESC")
    List<TrendDto> findNWhereCategoryByOrderByScoreDescDto(Pageable pageable, @Param("category") String category);

    @Query("SELECT new com.ybigta.trenbien.domain.entity.dto.TrendDto(t.name, t.category, t.detailedAddress, t.placeUrl, t.imageUrl,  t.tag1, t.tag2) FROM Trend t WHERE t.district = :districtNum ORDER BY t.score DESC")
    List<TrendDto> findNWhereDistrictByOrderByScoreDescDto(Pageable pageable, @Param("districtNum") Integer districtNum);

    @Query("SELECT new com.ybigta.trenbien.domain.entity.dto.TrendLongLatDto(t.name, t.category, t.detailedAddress, t.placeUrl, t.imageUrl,  t.tag1, t.tag2, t.latitude, t.longitude) FROM Trend t WHERE t.district = :districtNum ORDER BY t.score DESC")
    List<TrendLongLatDto> findNByOrderByScoreDescLongLatDto(Pageable pageable, @Param("districtNum") Integer districtNum);
}

