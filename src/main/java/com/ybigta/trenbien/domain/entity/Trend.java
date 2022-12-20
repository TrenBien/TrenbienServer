package com.ybigta.trenbien.domain.entity;

import lombok.*;

import javax.persistence.*;

@Table(name = "trend")
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Trend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "category")
    private String category;

    @Column(name = "tag")
    private String tag;

    @Column(name = "detailed_address")
    private String detailedAddress;

    @Column(name = "district")
    private String district;

    @Column(name = "latitude")
    private Float latitude;

    @Column(name = "longitude")
    private Float longitude;

    @Column(name = "score")
    private Integer score;

    @Column(name = "place_url")
    private String placeUrl;

    @Column(name = "image_url")
    private String imageUrl;

    @Builder
    public Trend(String name, String category, String tag, String detailedAddress, String district, Float latitude, Float longitude, Integer score, String placeUrl, String imageUrl){
        this.name = name;
        this.category = category;
        this.tag = tag;
        this.detailedAddress = detailedAddress;
        this.district = district;
        this.latitude = latitude;
        this.longitude = longitude;
        this.score = score;
        this.placeUrl = placeUrl;
        this.imageUrl = imageUrl;
    }
}