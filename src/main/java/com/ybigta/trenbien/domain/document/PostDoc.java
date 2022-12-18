package com.ybigta.trenbien.domain.document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;

@Document("posts")
@Getter
@Setter
public class PostDoc {
    @Id
    @Field("_id")
    private String id;

    @Field("address")
    private String address;

    @Field("blog_review")
    private String blogReview;

    @Field("category")
    private String category;

    @Field("date_diff")
    private String dateDiff;

    @Field("date_max")
    private String dateMax;

    @Field("detailed_address")
    private String detailedAddress;

    @Field("grade")
    private String grade;

    @Field("HashtagNum")
    private String hashTagNum;

    @Field("kakao_review_num")
    private String kakaoReviewNum;

    @Field("kakao_score")
    private String kakaoScore;

    @Field("place")
    private String place;

    @Field("place_url")
    private String placeUrl;

    @Field("posts")
    private String posts;

    @Field("visitor_review")
    private String visitorReview;

    @Field("가격이 합리적이에요")
    private String priceIsReasonable;

    @Field("가성비가 좋아요")
    private String goodValueForMoney;

    @Field("놀거리가 많아요")
    private String thereAreManyThingsToDo;

    @Field("단체모임 하기 좋아요")
    private String goodForGroupMeeting;

    @Field("대화하기 좋아요")
    private String goodForTalking;

    @Field("디저트가 맛있어요")
    private String desertIsGood;

    @Field("매장이 넓어요")
    private String storeIsSpacious;

    @Field("매장이 청결해요")
    private String storeIsClean;

    @Field("부모도 쉬기 좋아요")
    private String parentsLiketoRest;

    @Field("뷰가 좋아요")
    private String viewIsGood;

    @Field("비싼 만큼 가치있어요")
    private String worthAsMuchAsExpensive;

    @Field("빵이 맛있어요")
    private String breadIsDelicious;

    @Field("사진이 잘 나와요")
    private String goodForPicture;

    @Field("설명이 자세해요")
    private String explanationIsDetailed;

    @Field("양이 많아요")
    private String quantityIsGood;

    @Field("원데이 클래스가 알차요")
    private String oneDayClassIsGood;

    @Field("음료가 맛있어요")
    private String drinkIsGood;

    @Field("음식이 맛있어요")
    private String foodIsGood;

    @Field("인테리어가 멋져요")
    private String interiorIsGood;

    @Field("재료가 신선해요")
    private String ingredientIsFresh;

    @Field("주차하기 편해요")
    private String goodForParking;

    @Field("추천을 잘해줘요")
    private String giveGoodRecommendation;

    @Field("친절해요")
    private String goodForKindness;

    @Field("커피가 맛있어요")
    private String coffeeIsDelicious;

    @Field("특별한 날 가기 좋아요")
    private String goodForSpecialDay;

    @Field("특별한 메뉴가 있어요")
    private String specialMenuExists;

    @Field("혼밥하기 좋아요")
    private String goodForEatingAlone;

    @Field("화장실이 깨끗해요")
    private String toiletIsClean;
}