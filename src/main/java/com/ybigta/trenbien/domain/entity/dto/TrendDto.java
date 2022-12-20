package com.ybigta.trenbien.domain.entity.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TrendDto {
    @Column(name = "name")
    private String name;

    @Column(name = "category")
    private String category;

    @Column(name = "tag")
    private String tag;

    @Column(name = "detailed_address")
    private String detailedAddress;

    @Column(name = "place_url")
    private String placeUrl;

    @Column(name = "image_url")
    private String imageUrl;

    @Builder
    public TrendDto(String name, String category, String tag, String detailedAddress, String placeUrl, String imageUrl){
        this.name = name;
        this.category = category;
        this.tag = tag;
        this.detailedAddress = detailedAddress;
        this.placeUrl = placeUrl;
        this.imageUrl = imageUrl;
    }
}
