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

    @Field("date_score")
    private String dateScore;

    @Field("detailed_address")
    private String detailedAddress;

    @Field("grade")
    private String grade;

    @Field("HashtagNum")
    private String hashTagNum;

    @Field("image")
    private String image;

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

    @Field("trend")
    private String trend;

    @Field("visitor_review")
    private String visitorReview;

    @Field("가격이 합리적이에요")
    private String priceIsReasonable;

    @Field("가성비가 좋아요")
    private String goodValueForMoney;

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
    private String parentsLikeToRest;

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

    @Field("바비큐 해먹기 좋아요")
    private String goodForBarbecue;

    @Field("선물하기 좋아요")
    private String goodForGift;

    @Field("안전하게 관리해요")
    private String manageSafely;

    @Field("휴게공간이 잘 되어있어요")
    private String restAreaIsWellEquipped;

    @Field("초보자에게도 적합해요")
    private String suitableForBeginners;

    @Field("수업 시간이 충분해요")
    private String enoughClassTime;

    @Field("책 읽기 쾌적해요")
    private String pleasantForReading;

    @Field("메뉴 구성이 알차요")
    private String menuStructureIsClear;

    @Field("고기 질이 좋아요")
    private String meatQualityIsGood;

    @Field("직접 잘 구워줘요")
    private String bakeWell;

    @Field("테마가 재미있어요")
    private String themeIsInteresting;

    @Field("아늑해요")
    private String cozy;

    @Field("건강한 맛이에요")
    private String healthyTastes;

    @Field("집중하기 좋아요")
    private String goodForFocus;

    @Field("룸이 잘 되어있어요")
    private String roomIsGood;

    @Field("컨셉이 독특해요")
    private String conceptIsUnique;

    @Field("맞춤 수업을 잘해줘요")
    private String customClassIsGood;

    @Field("포장이 깔끔해요")
    private String packagingIsClean;

    @Field("현지 맛에 가까워요")
    private String closeToLocalTaste;

    @Field("음식이 빨리 나와요")
    private String foodComesFast;

    @Field("좌석이 편해요")
    private String seatIsComfortable;

    @Field("체험 프로그램이 다양해요")
    private String experienceProgramsAreVarious;

    @Field("반찬이 잘 나와요")
    private String sideDishesAreGood;

    @Field("예쁜 소품이 많아요")
    private String manyPrettyItems;

    @Field("야외 공간이 멋져요")
    private String outdoorSpaceIsNice;

    @Field("상품이 다양해요")
    private String productsAreDiverse;

    @Field("조식이 맛있어요")
    private String breakfastIsDelicious;

    @Field("오래 머무르기 좋아요")
    private String goodForStayingLong;

    @Field("시설이 깔끔해요")
    private String facilitiesAreClean;

    @Field("공간이 넓어요")
    private String spaceIsLarge;

    @Field("체험 프로그램이 많아요")
    private String manyExperiencePrograms;

    @Field("환기가 잘 돼요")
    private String ventilationIsGood;

    @Field("품질이 좋아요")
    private String qualityIsGood;

    @Field("차분한 분위기에요")
    private String calmMood;

    @Field("조용히 쉬기 좋아요")
    private String goodForResting;

    @Field("규모가 커요")
    private String big;

    @Field("관리가 잘 되어있어요")
    private String wellManaged;

    @Field("특색 있는 제품이 많아요")
    private String manySpecialProducts;

    @Field("프라이빗해요")
    private String isPrivate;

    @Field("경도")
    private String longitude;

    @Field("위도")
    private String latitude;
}