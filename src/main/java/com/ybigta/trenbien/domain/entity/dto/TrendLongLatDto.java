package com.ybigta.trenbien.domain.entity.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TrendLongLatDto implements Comparable<TrendLongLatDto>{
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

    @Column(name = "latitude")
    private Float latitude;

    @Column(name = "longitude")
    private Float longitude;

    private Integer distance;

    public void setDistance(Integer distance){
        this.distance = distance;
    }

    @Override
    public int compareTo(TrendLongLatDto trendLongLatDto) {
        return this.distance > trendLongLatDto.distance ? 1 : - 1;
    }

    @Builder
    public TrendLongLatDto(String name, String category, String detailedAddress, String placeUrl, String imageUrl, String tag1, String tag2, Float latitude, Float longitude){
        this.name = name;
        this.category = category;
        this.detailedAddress = detailedAddress;
        this.placeUrl = placeUrl;
        this.imageUrl = imageUrl;
        this.tag1 = tag1;
        this.tag2 = tag2;
        this.latitude = latitude;
        this.longitude = longitude;
        this.distance = null;
    }
}
