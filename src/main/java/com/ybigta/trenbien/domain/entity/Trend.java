package com.ybigta.trenbien.domain.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Field;

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

    @Column(name = "detailed_address")
    private String detailedAddress;

    @Column(name = "district")
    private Integer district;

    @Column(name = "latitude")
    private Float latitude;

    @Column(name = "longitude")
    private Float longitude;

    @Column(name = "score")
    private Float score;

    @Column(name = "place_url")
    private String placeUrl;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "price_is_reasonable")
    private Float priceIsReasonable;

    @Column(name = "good_value_for_money")
    private Float goodValueForMoney;

    @Column(name = "there_are_many_things_to_do")
    private Float thereAreManyThingsToDo;

    @Column(name = "good_for_group_meeting")
    private Float goodForGroupMeeting;

    @Column(name = "good_for_talking")
    private Float goodForTalking;

    @Column(name = "desert_is_good")
    private Float desertIsGood;

    @Column(name = "store_is_spacious")
    private Float storeIsSpacious;

    @Column(name = "store_is_clean")
    private Float storeIsClean;

    @Column(name = "parents_like_to_Rest")
    private Float parentsLikeToRest;

    @Column(name = "view_is_good")
    private Float viewIsGood;

    @Column(name = "worth_as_much_as_expensive")
    private Float worthAsMuchAsExpensive;

    @Column(name = "bread_is_delicious")
    private Float breadIsDelicious;

    @Column(name = "good_for_picture")
    private Float goodForPicture;

    @Column(name = "explanation_is_detailed")
    private Float explanationIsDetailed;

    @Column(name = "quantity_is_good")
    private Float quantityIsGood;

    @Column(name = "one_day_class_is_good")
    private Float oneDayClassIsGood;

    @Column(name = "drink_is_good")
    private Float drinkIsGood;

    @Column(name = "food_is_good")
    private Float foodIsGood;

    @Column(name = "interior_is_good")
    private Float interiorIsGood;

    @Column(name = "ingredient_is_fresh")
    private Float ingredientIsFresh;

    @Column(name = "good_for_parking")
    private Float goodForParking;

    @Column(name = "give_good_recommendation")
    private Float giveGoodRecommendation;

    @Column(name = "good_for_kindness")
    private Float goodForKindness;

    @Column(name = "coffee_is_delicious")
    private Float coffeeIsDelicious;

    @Column(name = "good_for_special_day")
    private Float goodForSpecialDay;

    @Column(name = "special_menu_exists")
    private Float specialMenuExists;

    @Column(name = "good_for_eating_alone")
    private Float goodForEatingAlone;

    @Column(name = "toilet_is_clean")
    private Float toiletIsClean;

    @Column(name = "tag1")
    private String tag1;

    @Column(name = "tag2")
    private String tag2;

    @Builder
    public Trend(String name,
                 String category,
                 String detailedAddress,
                 Integer district,
                 Float latitude,
                 Float longitude,
                 Float score,
                 String placeUrl,
                 String imageUrl,
                 Float priceIsReasonable,
                 Float goodValueForMoney,
                 Float thereAreManyThingsToDo,
                 Float goodForGroupMeeting,
                 Float goodForTalking,
                 Float desertIsGood,
                 Float storeIsSpacious,
                 Float storeIsClean,
                 Float parentsLikeToRest,
                 Float viewIsGood,
                 Float worthAsMuchAsExpensive,
                 Float breadIsDelicious,
                 Float goodForPicture,
                 Float explanationIsDetailed,
                 Float quantityIsGood,
                 Float oneDayClassIsGood,
                 Float drinkIsGood,
                 Float foodIsGood,
                 Float interiorIsGood,
                 Float ingredientIsFresh,
                 Float goodForParking,
                 Float giveGoodRecommendation,
                 Float goodForKindness,
                 Float coffeeIsDelicious,
                 Float goodForSpecialDay,
                 Float specialMenuExists,
                 Float goodForEatingAlone,
                 Float toiletIsClean,
                 String tag1,
                 String tag2
                 ){
        this.name = name;
        this.category = category;
        this.detailedAddress = detailedAddress;
        this.district = district;
        this.latitude = latitude;
        this.longitude = longitude;
        this.score = score;
        this.placeUrl = placeUrl;
        this.imageUrl = imageUrl;
        this.priceIsReasonable = priceIsReasonable;
        this.goodValueForMoney = goodValueForMoney;
        this.thereAreManyThingsToDo = thereAreManyThingsToDo;
        this.goodForGroupMeeting = goodForGroupMeeting;
        this.goodForTalking = goodForTalking;
        this.desertIsGood = desertIsGood;
        this.storeIsSpacious = storeIsSpacious;
        this.storeIsClean = storeIsClean;
        this.parentsLikeToRest = parentsLikeToRest;
        this.viewIsGood = viewIsGood;
        this.worthAsMuchAsExpensive = worthAsMuchAsExpensive;
        this.breadIsDelicious = breadIsDelicious;
        this.goodForPicture = goodForPicture;
        this.explanationIsDetailed = explanationIsDetailed;
        this.quantityIsGood = quantityIsGood;
        this.oneDayClassIsGood = oneDayClassIsGood;
        this.drinkIsGood = drinkIsGood;
        this.foodIsGood = foodIsGood;
        this.interiorIsGood = interiorIsGood;
        this.ingredientIsFresh = ingredientIsFresh;
        this.goodForParking = goodForParking;
        this.giveGoodRecommendation = giveGoodRecommendation;
        this.goodForKindness = goodForKindness;
        this.coffeeIsDelicious = coffeeIsDelicious;
        this.goodForSpecialDay = goodForSpecialDay;
        this.specialMenuExists = specialMenuExists;
        this.goodForEatingAlone = goodForEatingAlone;
        this.toiletIsClean = toiletIsClean;
        this.tag1 = tag1;
        this.tag2 = tag2;
    }
}