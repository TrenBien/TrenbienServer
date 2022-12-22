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

    @Column(name = "good_for_barbecue")
    private Float goodForBarbecue;

    @Column(name = "good_for_gift")
    private Float goodForGift;

    @Column(name = "manage_safely")
    private Float manageSafely;

    @Column(name = "rest_area_is_well_equipped")
    private Float restAreaIsWellEquipped;

    @Column(name = "suitable_for_beginners")
    private Float suitableForBeginners;

    @Column(name = "enough_class_time")
    private Float enoughClassTime;

    @Column(name = "pleasant_for_reading")
    private Float pleasantForReading;

    @Column(name = "menu_structure_is_clear")
    private Float menuStructureIsClear;

    @Column(name = "meat_quality_is_good")
    private Float meatQualityIsGood;

    @Column(name = "bake_well")
    private Float bakeWell;

    @Column(name = "theme_is_interesting")
    private Float themeIsInteresting;

    @Column(name = "cozy")
    private Float cozy;

    @Column(name = "healthy_tastes")
    private Float healthyTastes;

    @Column(name = "good_for_focus")
    private Float goodForFocus;

    @Column(name = "room_is_good")
    private Float roomIsGood;

    @Column(name = "concept_is_unique")
    private Float conceptIsUnique;

    @Column(name = "custom_class_is_good")
    private Float customClassIsGood;

    @Column(name = "packaging_is_clean")
    private Float packagingIsClean;

    @Column(name = "close_to_local_taste")
    private Float closeToLocalTaste;

    @Column(name = "food_comes_fast")
    private Float foodComesFast;

    @Column(name = "seat_is_comfortable")
    private Float seatIsComfortable;

    @Column(name = "experience_programs_are_various")
    private Float experienceProgramsAreVarious;

    @Column(name = "side_dishes_are_good")
    private Float sideDishesAreGood;

    @Column(name = "many_pretty_items")
    private Float manyPrettyItems;

    @Column(name = "outdoor_space_is_nice")
    private Float outdoorSpaceIsNice;

    @Column(name = "products_are_diverse")
    private Float productsAreDiverse;

    @Column(name = "breakfast_is_delicious")
    private Float breakfastIsDelicious;

    @Column(name = "good_for_staying_long")
    private Float goodForStayingLong;

    @Column(name = "facilities_are_clean")
    private Float facilitiesAreClean;

    @Column(name = "space_is_large")
    private Float spaceIsLarge;

    @Column(name = "many_experience_programs")
    private Float manyExperiencePrograms;

    @Column(name = "ventilation_is_good")
    private Float ventilationIsGood;

    @Column(name = "quality_is_good")
    private Float qualityIsGood;

    @Column(name = "calm_mood")
    private Float calmMood;

    @Column(name = "good_for_resting")
    private Float goodForResting;

    @Column(name = "big")
    private Float big;

    @Column(name = "well_managed")
    private Float wellManaged;

    @Column(name = "many_special_products")
    private Float manySpecialProducts;

    @Column(name = "is_private")
    private Float isPrivate;

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
                 Float goodForKindness,
                 Float coffeeIsDelicious,
                 Float goodForSpecialDay,
                 Float specialMenuExists,
                 Float goodForEatingAlone,
                 Float toiletIsClean,
                 Float goodForBarbecue,
                 Float goodForGift,
                 Float manageSafely,
                 Float restAreaIsWellEquipped,
                 Float suitableForBeginners,
                 Float enoughClassTime,
                 Float pleasantForReading,
                 Float menuStructureIsClear,
                 Float meatQualityIsGood,
                 Float bakeWell,
                 Float themeIsInteresting,
                 Float cozy,
                 Float healthyTastes,
                 Float goodForFocus,
                 Float roomIsGood,
                 Float conceptIsUnique,
                 Float customClassIsGood,
                 Float packagingIsClean,
                 Float closeToLocalTaste,
                 Float foodComesFast,
                 Float seatIsComfortable,
                 Float experienceProgramsAreVarious,
                 Float sideDishesAreGood,
                 Float manyPrettyItems,
                 Float outdoorSpaceIsNice,
                 Float productsAreDiverse,
                 Float breakfastIsDelicious,
                 Float goodForStayingLong,
                 Float facilitiesAreClean,
                 Float spaceIsLarge,
                 Float manyExperiencePrograms,
                 Float ventilationIsGood,
                 Float qualityIsGood,
                 Float calmMood,
                 Float goodForResting,
                 Float big,
                 Float wellManaged,
                 Float manySpecialProducts,
                 Float isPrivate,
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
        this.goodForKindness = goodForKindness;
        this.coffeeIsDelicious = coffeeIsDelicious;
        this.goodForSpecialDay = goodForSpecialDay;
        this.specialMenuExists = specialMenuExists;
        this.goodForEatingAlone = goodForEatingAlone;
        this.toiletIsClean = toiletIsClean;
        this.goodForBarbecue = goodForBarbecue;
        this.goodForGift = goodForGift;
        this.manageSafely = manageSafely;
        this.restAreaIsWellEquipped = restAreaIsWellEquipped;
        this.suitableForBeginners = suitableForBeginners;
        this.enoughClassTime = enoughClassTime;
        this.pleasantForReading = pleasantForReading;
        this.menuStructureIsClear = menuStructureIsClear;
        this.meatQualityIsGood = meatQualityIsGood;
        this.bakeWell = bakeWell;
        this.themeIsInteresting = themeIsInteresting;
        this.cozy = cozy;
        this.healthyTastes = healthyTastes;
        this.goodForFocus = goodForFocus;
        this.roomIsGood = roomIsGood;
        this.conceptIsUnique = conceptIsUnique;
        this.customClassIsGood = customClassIsGood;
        this.packagingIsClean = packagingIsClean;
        this.closeToLocalTaste = closeToLocalTaste;
        this.foodComesFast = foodComesFast;
        this.seatIsComfortable = seatIsComfortable;
        this.experienceProgramsAreVarious = experienceProgramsAreVarious;
        this.sideDishesAreGood = sideDishesAreGood;
        this.manyPrettyItems = manyPrettyItems;
        this.outdoorSpaceIsNice = outdoorSpaceIsNice;
        this.productsAreDiverse = productsAreDiverse;
        this.breakfastIsDelicious = breakfastIsDelicious;
        this.goodForStayingLong = goodForStayingLong;
        this.facilitiesAreClean = facilitiesAreClean;
        this.spaceIsLarge = spaceIsLarge;
        this.manyExperiencePrograms = manyExperiencePrograms;
        this.ventilationIsGood = ventilationIsGood;
        this.qualityIsGood = qualityIsGood;
        this.calmMood = calmMood;
        this.goodForResting = goodForResting;
        this.big = big;
        this.wellManaged = wellManaged;
        this.manySpecialProducts = manySpecialProducts;
        this.isPrivate = isPrivate;
        this.tag1 = tag1;
        this.tag2 = tag2;
    }
}