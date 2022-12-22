package com.ybigta.trenbien.domain.entity.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TrendRecommandScoreDto implements Comparable<TrendRecommandScoreDto>{
    @Column(name = "name")
    private String name;

    @Column(name = "category")
    private String category;

    @Column(name = "detailed_address")
    private String detailedAddress;

    @Column(name = "place_url")
    private String placeUrl;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "tag1")
    private String tag1;

    @Column(name = "tag2")
    private String tag2;

    private Float recommandScore;

    public void setRecommandScore(Float recommandScore){
        this.recommandScore = recommandScore;
    }

    @Override
    public int compareTo(TrendRecommandScoreDto trendRecommandScoreDto) {
        return this.recommandScore <= trendRecommandScoreDto.recommandScore ? 1 : - 1;
    }

    @Builder
    public TrendRecommandScoreDto(String name, String category, String detailedAddress, String placeUrl, String imageUrl, String tag1, String tag2){
        this.name = name;
        this.category = category;
        this.detailedAddress = detailedAddress;
        this.placeUrl = placeUrl;
        this.imageUrl = imageUrl;
        this.tag1 = tag1;
        this.tag2 = tag2;
    }
}
