package com.ybigta.trenbien.datamigration;

import com.ybigta.trenbien.domain.document.PostDoc;
import com.ybigta.trenbien.domain.entity.Trend;
import com.ybigta.trenbien.service.PostService;
import com.ybigta.trenbien.util.Pair;
import com.ybigta.trenbien.valuemapping.DistrictMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;
import java.util.PriorityQueue;

@Service
public class MongodbToMysql {
    @Autowired
    private PostService postService;

    private final Logger log = LoggerFactory.getLogger(getClass());

    public void insertDataFromMongodbToMysql(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("trenbien");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        List<PostDoc> postCollection = postService.findAllPost();

        for (PostDoc post : postCollection){
            //null처리

            String postAddress = post.getAddress();
            String postCategory = post.getCategory();
            String postDetailedAddress = post.getDetailedAddress();
            String postImage = post.getImage();
            String postPlace = post.getPlace();
            String postPlaceUrl = post.getPlaceUrl();
            String postTrend = post.getTrend();
            String postLongitude = post.getLongitude();
            String postLatitude = post.getLatitude();
            String postPriceIsReasonable = post.getPriceIsReasonable();
            String postGoodValueForMoney = post.getGoodValueForMoney();
            String postGoodForGroupMeeting = post.getGoodForGroupMeeting();
            String postGoodForTalking = post.getGoodForTalking();
            String postDesertIsGood = post.getDesertIsGood();
            String postStoreIsSpacious = post.getStoreIsSpacious();
            String postStoreIsClean = post.getStoreIsClean();
            String postParentsLikeToRest = post.getParentsLikeToRest();
            String postViewIsGood = post.getViewIsGood();
            String postWorthAsMuchAsExpensive = post.getWorthAsMuchAsExpensive();
            String postBreadIsDelicious = post.getBreadIsDelicious();
            String postGoodForPicture = post.getGoodForPicture();
            String postExplanationIsDetailed = post.getExplanationIsDetailed();
            String postQuantityIsGood = post.getQuantityIsGood();
            String postOneDayClassIsGood = post.getOneDayClassIsGood();
            String postDrinkIsGood = post.getDrinkIsGood();
            String postFoodIsGood = post.getFoodIsGood();
            String postInteriorIsGood = post.getInteriorIsGood();
            String postIngredientIsFresh = post.getIngredientIsFresh();
            String postGoodForParking = post.getGoodForParking();
            String postGoodForKindness = post.getGoodForKindness();
            String postCoffeeIsDelicious = post.getCoffeeIsDelicious();
            String postGoodForSpecialDay = post.getGoodForSpecialDay();
            String postSpecialMenuExists = post.getSpecialMenuExists();
            String postGoodForEatingAlone = post.getGoodForEatingAlone();
            String postToiletIsClean = post.getToiletIsClean();
            String postGoodForBarbecue = post.getGoodForBarbecue();
            String postGoodForGift = post.getGoodForGift();
            String postManageSafely = post.getManageSafely();
            String postRestAreaIsWellEquipped = post.getRestAreaIsWellEquipped();
            String postSuitableForBeginners = post.getSuitableForBeginners();
            String postEnoughClassTime = post.getEnoughClassTime();
            String postPleasantForReading = post.getPleasantForReading();
            String postMenuStructureIsClear = post.getMenuStructureIsClear();
            String postMeatQualityIsGood = post.getMeatQualityIsGood();
            String postBakeWell = post.getBakeWell();
            String postThemeIsInteresting = post.getThemeIsInteresting();
            String postCozy = post.getCozy();
            String postHealthyTastes = post.getHealthyTastes();
            String postGoodForFocus = post.getGoodForFocus();
            String postRoomIsGood = post.getRoomIsGood();
            String postCnceptIsUnique = post.getConceptIsUnique();
            String postCustomClassIsGood = post.getCustomClassIsGood();
            String postPackagingIsClean = post.getPackagingIsClean();
            String postCloseToLocalTaste = post.getCloseToLocalTaste();
            String postFoodComesFast = post.getFoodComesFast();
            String postSeatIsComfortable = post.getSeatIsComfortable();
            String postExperienceProgramsAreVarious = post.getExperienceProgramsAreVarious();
            String postSideDishesAreGood = post.getSideDishesAreGood();
            String postManyPrettyItems = post.getManyPrettyItems();
            String postOutdoorSpaceIsNice = post.getOutdoorSpaceIsNice();
            String postProductsAreDiverse = post.getProductsAreDiverse();
            String postBreakfastIsDelicious = post.getBreakfastIsDelicious();
            String postGoodForStayingLong = post.getGoodForStayingLong();
            String postFacilitiesAreClean = post.getFacilitiesAreClean();
            String postSpaceIsLarge = post.getSpaceIsLarge();
            String postManyExperiencePrograms = post.getManyExperiencePrograms();
            String postVentilationIsGood = post.getVentilationIsGood();
            String postQualityIsGood = post.getQualityIsGood();
            String postCalmMood = post.getCalmMood();
            String postGoodForResting = post.getGoodForResting();
            String postBig = post.getBig();
            String postWellManaged = post.getWellManaged();
            String postManySpecialProducts = post.getManySpecialProducts();
            String postIsPrivate = post.getIsPrivate();

            Integer postDistrictInt = DistrictMap.DistrictHashMap.get(postAddress);
            Float postTrendFloat;
            if (postTrend == null){
                postTrendFloat = null;
            }
            else{
                postTrendFloat = Float.parseFloat(postTrend);
            }

            Float postLongitudeFloat;
            if (postLongitude == null){
                postLongitudeFloat = null;
            }
            else{
                postLongitudeFloat = Float.parseFloat(postLongitude);
            }
            Float postLatitudeFloat;
            if (postLatitude == null){
                postLatitudeFloat = null;
            }
            else{
                postLatitudeFloat = Float.parseFloat(postLatitude);
            }
            Float postPriceIsReasonableFloat = Float.parseFloat(postPriceIsReasonable);
            Float postGoodValueForMoneyFloat = Float.parseFloat(postGoodValueForMoney);
            Float postGoodForGroupMeetingFloat = Float.parseFloat(postGoodForGroupMeeting);
            Float postGoodForTalkingFloat = Float.parseFloat(postGoodForTalking);
            Float postDesertIsGoodFloat = Float.parseFloat(postDesertIsGood);
            Float postStoreIsSpaciousFloat = Float.parseFloat(postStoreIsSpacious);
            Float postStoreIsCleanFloat = Float.parseFloat(postStoreIsClean);
            Float postParentsLikeToRestFloat = Float.parseFloat(postParentsLikeToRest);
            Float postViewIsGoodFloat = Float.parseFloat(postViewIsGood);
            Float postWorthAsMuchAsExpensiveFloat = Float.parseFloat(postWorthAsMuchAsExpensive);
            Float postBreadIsDeliciousFloat = Float.parseFloat(postBreadIsDelicious);
            Float postGoodForPictureFloat = Float.parseFloat(postGoodForPicture);
            Float postExplanationIsDetailedFloat = Float.parseFloat(postExplanationIsDetailed);
            Float postQuantityIsGoodFloat = Float.parseFloat(postQuantityIsGood);
            Float postOneDayClassIsGoodFloat = Float.parseFloat(postOneDayClassIsGood);
            Float postDrinkIsGoodFloat = Float.parseFloat(postDrinkIsGood);
            Float postFoodIsGoodFloat = Float.parseFloat(postFoodIsGood);
            Float postInteriorIsGoodFloat = Float.parseFloat(postInteriorIsGood);
            Float postIngredientIsFreshFloat = Float.parseFloat(postIngredientIsFresh);
            Float postGoodForParkingFloat = Float.parseFloat(postGoodForParking);
            Float postGoodForKindnessFloat = Float.parseFloat(postGoodForKindness);
            Float postCoffeeIsDeliciousFloat = Float.parseFloat(postCoffeeIsDelicious);
            Float postGoodForSpecialDayFloat = Float.parseFloat(postGoodForSpecialDay);
            Float postSpecialMenuExistsFloat = Float.parseFloat(postSpecialMenuExists);
            Float postGoodForEatingAloneFloat = Float.parseFloat(postGoodForEatingAlone);
            Float postToiletIsCleanFloat = Float.parseFloat(postToiletIsClean);
            Float postGoodForBarbecueFloat = Float.parseFloat(postGoodForBarbecue);
            Float postGoodForGiftFloat = Float.parseFloat(postGoodForGift);
            Float postManageSafelyFloat = Float.parseFloat(postManageSafely);
            Float postRestAreaIsWellEquippedFloat = Float.parseFloat(postRestAreaIsWellEquipped);
            Float postSuitableForBeginnersFloat = Float.parseFloat(postSuitableForBeginners);
            Float postEnoughClassTimeFloat = Float.parseFloat(postEnoughClassTime);
            Float postPleasantForReadingFloat = Float.parseFloat(postPleasantForReading);
            Float postMenuStructureIsClearFloat = Float.parseFloat(postMenuStructureIsClear);
            Float postMeatQualityIsGoodFloat = Float.parseFloat(postMeatQualityIsGood);
            Float postBakeWellFloat = Float.parseFloat(postBakeWell);
            Float postThemeIsInterestingFloat = Float.parseFloat(postThemeIsInteresting);
            Float postCozyFloat = Float.parseFloat(postCozy);
            Float postHealthyTastesFloat = Float.parseFloat(postHealthyTastes);
            Float postGoodForFocusFloat = Float.parseFloat(postGoodForFocus);
            Float postRoomIsGoodFloat = Float.parseFloat(postRoomIsGood);
            Float postCnceptIsUniqueFloat = Float.parseFloat(postCnceptIsUnique);
            Float postCustomClassIsGoodFloat = Float.parseFloat(postCustomClassIsGood);
            Float postPackagingIsCleanFloat = Float.parseFloat(postPackagingIsClean);
            Float postCloseToLocalTasteFloat = Float.parseFloat(postCloseToLocalTaste);
            Float postFoodComesFastFloat = Float.parseFloat(postFoodComesFast);
            Float postSeatIsComfortableFloat = Float.parseFloat(postSeatIsComfortable);
            Float postExperienceProgramsAreVariousFloat = Float.parseFloat(postExperienceProgramsAreVarious);
            Float postSideDishesAreGoodFloat = Float.parseFloat(postSideDishesAreGood);
            Float postManyPrettyItemsFloat = Float.parseFloat(postManyPrettyItems);
            Float postOutdoorSpaceIsNiceFloat = Float.parseFloat(postOutdoorSpaceIsNice);
            Float postProductsAreDiverseFloat = Float.parseFloat(postProductsAreDiverse);
            Float postBreakfastIsDeliciousFloat = Float.parseFloat(postBreakfastIsDelicious);
            Float postGoodForStayingLongFloat = Float.parseFloat(postGoodForStayingLong);
            Float postFacilitiesAreCleanFloat = Float.parseFloat(postFacilitiesAreClean);
            Float postSpaceIsLargeFloat = Float.parseFloat(postSpaceIsLarge);
            Float postManyExperienceProgramsFloat = Float.parseFloat(postManyExperiencePrograms);
            Float postVentilationIsGoodFloat = Float.parseFloat(postVentilationIsGood);
            Float postQualityIsGoodFloat = Float.parseFloat(postQualityIsGood);
            Float postCalmMoodFloat = Float.parseFloat(postCalmMood);
            Float postGoodForRestingFloat = Float.parseFloat(postGoodForResting);
            Float postBigFloat = Float.parseFloat(postBig);
            Float postWellManagedFloat = Float.parseFloat(postWellManaged);
            Float postManySpecialProductsFloat = Float.parseFloat(postManySpecialProducts);
            Float postIsPrivateFloat = Float.parseFloat(postIsPrivate);

            PriorityQueue<Pair> pq = new PriorityQueue<>();
            pq.add(new Pair(postPriceIsReasonableFloat, "가격이 합리적이에요"));
            pq.add(new Pair(postGoodValueForMoneyFloat, "가성비가 좋아요"));
            pq.add(new Pair(postGoodForGroupMeetingFloat, "단체모임 하기 좋아요"));
            pq.add(new Pair(postGoodForTalkingFloat, "대화하기 좋아요"));
            pq.add(new Pair(postDesertIsGoodFloat, "디저트가 맛있어요"));
            pq.add(new Pair(postStoreIsSpaciousFloat, "매장이 넓어요"));
            pq.add(new Pair(postStoreIsCleanFloat, "매장이 청결해요"));
            pq.add(new Pair(postParentsLikeToRestFloat, "부모도 쉬기 좋아요"));
            pq.add(new Pair(postViewIsGoodFloat, "뷰가 좋아요"));
            pq.add(new Pair(postWorthAsMuchAsExpensiveFloat, "비싼 만큼 가치있어요"));
            pq.add(new Pair(postBreadIsDeliciousFloat, "빵이 맛있어요"));
            pq.add(new Pair(postGoodForPictureFloat, "사진이 잘 나와요"));
            pq.add(new Pair(postExplanationIsDetailedFloat, "설명이 자세해요"));
            pq.add(new Pair(postQuantityIsGoodFloat, "양이 많아요"));
            pq.add(new Pair(postOneDayClassIsGoodFloat, "원데이 클래스가 알차요"));
            pq.add(new Pair(postDrinkIsGoodFloat, "음료가 맛있어요"));
            pq.add(new Pair(postFoodIsGoodFloat, "음식이 맛있어요"));
            pq.add(new Pair(postInteriorIsGoodFloat, "인테리어가 멋져요"));
            pq.add(new Pair(postIngredientIsFreshFloat, "재료가 신선해요"));
            pq.add(new Pair(postGoodForParkingFloat, "주차하기 편해요"));
            pq.add(new Pair(postGoodForKindnessFloat, "친절해요"));
            pq.add(new Pair(postCoffeeIsDeliciousFloat, "커피가 맛있어요"));
            pq.add(new Pair(postGoodForSpecialDayFloat, "특별한 날 가기 좋아요"));
            pq.add(new Pair(postSpecialMenuExistsFloat, "특별한 메뉴가 있어요"));
            pq.add(new Pair(postGoodForEatingAloneFloat, "혼밥하기 좋아요"));
            pq.add(new Pair(postToiletIsCleanFloat, "화장실이 깨끗해요"));
            pq.add(new Pair(postGoodForBarbecueFloat, "바비큐 해먹기 좋아요"));
            pq.add(new Pair(postGoodForGiftFloat, "선물하기 좋아요"));
            pq.add(new Pair(postManageSafelyFloat, "안전하게 관리해요"));
            pq.add(new Pair(postRestAreaIsWellEquippedFloat, "휴게공간이 잘 되어있어요"));
            pq.add(new Pair(postSuitableForBeginnersFloat, "초보자에게도 적합해요"));
            pq.add(new Pair(postEnoughClassTimeFloat, "수업 시간이 충분해요"));
            pq.add(new Pair(postPleasantForReadingFloat, "책 읽기 쾌적해요"));
            pq.add(new Pair(postMenuStructureIsClearFloat, "메뉴 구성이 알차요"));
            pq.add(new Pair(postMeatQualityIsGoodFloat, "고기 질이 좋아요"));
            pq.add(new Pair(postBakeWellFloat, "직접 잘 구워줘요"));
            pq.add(new Pair(postThemeIsInterestingFloat, "테마가 재미있어요"));
            pq.add(new Pair(postCozyFloat, "아늑해요"));
            pq.add(new Pair(postHealthyTastesFloat, "건강한 맛이에요"));
            pq.add(new Pair(postGoodForFocusFloat, "집중하기 좋아요"));
            pq.add(new Pair(postRoomIsGoodFloat, "룸이 잘 되어있어요"));
            pq.add(new Pair(postCnceptIsUniqueFloat, "컨셉이 독특해요"));
            pq.add(new Pair(postCustomClassIsGoodFloat, "맞춤 수업을 잘해줘요"));
            pq.add(new Pair(postPackagingIsCleanFloat, "포장이 깔끔해요"));
            pq.add(new Pair(postCloseToLocalTasteFloat, "현지 맛에 가까워요"));
            pq.add(new Pair(postFoodComesFastFloat, "음식이 빨리 나와요"));
            pq.add(new Pair(postSeatIsComfortableFloat, "좌석이 편해요"));
            pq.add(new Pair(postExperienceProgramsAreVariousFloat, "체험 프로그램이 다양해요"));
            pq.add(new Pair(postSideDishesAreGoodFloat, "반찬이 잘 나와요"));
            pq.add(new Pair(postManyPrettyItemsFloat, "예쁜 소품이 많아요"));
            pq.add(new Pair(postOutdoorSpaceIsNiceFloat, "야외 공간이 멋져요"));
            pq.add(new Pair(postProductsAreDiverseFloat, "상품이 다양해요"));
            pq.add(new Pair(postBreakfastIsDeliciousFloat, "조식이 맛있어요"));
            pq.add(new Pair(postGoodForStayingLongFloat, "오래 머무르기 좋아요"));
            pq.add(new Pair(postFacilitiesAreCleanFloat, "시설이 깔끔해요"));
            pq.add(new Pair(postSpaceIsLargeFloat, "공간이 넓어요"));
            pq.add(new Pair(postManyExperienceProgramsFloat, "체험 프로그램이 많아요"));
            pq.add(new Pair(postVentilationIsGoodFloat, "환기가 잘 돼요"));
            pq.add(new Pair(postQualityIsGoodFloat, "품질이 좋아요"));
            pq.add(new Pair(postCalmMoodFloat, "차분한 분위기에요"));
            pq.add(new Pair(postGoodForRestingFloat, "조용히 쉬기 좋아요"));
            pq.add(new Pair(postBigFloat, "규모가 커요"));
            pq.add(new Pair(postWellManagedFloat, "관리가 잘 되어있어요"));
            pq.add(new Pair(postManySpecialProductsFloat, "특색 있는 제품이 많아요"));
            pq.add(new Pair(postIsPrivateFloat, "프라이빗해요"));





            String tagTop1 = pq.poll().getValue();
            String tagTop2 = pq.poll().getValue();
            Trend trend = Trend.builder()
                    .name(postPlace)
                    .category(postCategory)
                    .detailedAddress(postDetailedAddress)
                    .district(postDistrictInt)
                    .latitude(postLatitudeFloat)
                    .longitude(postLongitudeFloat)
                    .score(postTrendFloat)
                    .placeUrl(postPlaceUrl)
                    .imageUrl(postImage)
                    .priceIsReasonable(postPriceIsReasonableFloat)
                    .goodValueForMoney(postGoodValueForMoneyFloat)
                    .goodForGroupMeeting(postGoodForGroupMeetingFloat)
                    .goodForTalking(postGoodForTalkingFloat)
                    .desertIsGood(postDesertIsGoodFloat)
                    .storeIsSpacious(postStoreIsSpaciousFloat)
                    .storeIsClean(postStoreIsCleanFloat)
                    .parentsLikeToRest(postParentsLikeToRestFloat)
                    .viewIsGood(postViewIsGoodFloat)
                    .worthAsMuchAsExpensive(postWorthAsMuchAsExpensiveFloat)
                    .breadIsDelicious(postBreadIsDeliciousFloat)
                    .goodForPicture(postGoodForPictureFloat)
                    .explanationIsDetailed(postExplanationIsDetailedFloat)
                    .quantityIsGood(postQuantityIsGoodFloat)
                    .oneDayClassIsGood(postOneDayClassIsGoodFloat)
                    .drinkIsGood(postDrinkIsGoodFloat)
                    .foodIsGood(postFoodIsGoodFloat)
                    .interiorIsGood(postInteriorIsGoodFloat)
                    .ingredientIsFresh(postIngredientIsFreshFloat)
                    .goodForParking(postGoodForParkingFloat)
                    .goodForKindness(postGoodForKindnessFloat)
                    .coffeeIsDelicious(postCoffeeIsDeliciousFloat)
                    .goodForSpecialDay(postGoodForSpecialDayFloat)
                    .specialMenuExists(postSpecialMenuExistsFloat)
                    .goodForEatingAlone(postGoodForEatingAloneFloat)
                    .toiletIsClean(postToiletIsCleanFloat)
                    .goodForBarbecue(postGoodForBarbecueFloat)
                    .goodForGift(postGoodForGiftFloat)
                    .manageSafely(postManageSafelyFloat)
                    .restAreaIsWellEquipped(postRestAreaIsWellEquippedFloat)
                    .suitableForBeginners(postSuitableForBeginnersFloat)
                    .enoughClassTime(postEnoughClassTimeFloat)
                    .pleasantForReading(postPleasantForReadingFloat)
                    .menuStructureIsClear(postMenuStructureIsClearFloat)
                    .meatQualityIsGood(postMeatQualityIsGoodFloat)
                    .bakeWell(postBakeWellFloat)
                    .themeIsInteresting(postThemeIsInterestingFloat)
                    .cozy(postCozyFloat)
                    .healthyTastes(postHealthyTastesFloat)
                    .goodForFocus(postGoodForFocusFloat)
                    .roomIsGood(postRoomIsGoodFloat)
                    .conceptIsUnique(postCnceptIsUniqueFloat)
                    .customClassIsGood(postCustomClassIsGoodFloat)
                    .packagingIsClean(postPackagingIsCleanFloat)
                    .closeToLocalTaste(postCloseToLocalTasteFloat)
                    .foodComesFast(postFoodComesFastFloat)
                    .seatIsComfortable(postSeatIsComfortableFloat)
                    .experienceProgramsAreVarious(postExperienceProgramsAreVariousFloat)
                    .sideDishesAreGood(postSideDishesAreGoodFloat)
                    .manyPrettyItems(postManyPrettyItemsFloat)
                    .outdoorSpaceIsNice(postOutdoorSpaceIsNiceFloat)
                    .productsAreDiverse(postProductsAreDiverseFloat)
                    .breakfastIsDelicious(postBreakfastIsDeliciousFloat)
                    .goodForStayingLong(postGoodForStayingLongFloat)
                    .facilitiesAreClean(postFacilitiesAreCleanFloat)
                    .spaceIsLarge(postSpaceIsLargeFloat)
                    .manyExperiencePrograms(postManyExperienceProgramsFloat)
                    .ventilationIsGood(postVentilationIsGoodFloat)
                    .qualityIsGood(postQualityIsGoodFloat)
                    .calmMood(postCalmMoodFloat)
                    .goodForResting(postGoodForRestingFloat)
                    .big(postBigFloat)
                    .wellManaged(postWellManagedFloat)
                    .manySpecialProducts(postManySpecialProductsFloat)
                    .isPrivate(postIsPrivateFloat)
                    .tag1(tagTop1)
                    .tag2(tagTop2)
                    .build();
            em.persist(trend);
        }
        tx.commit();
        em.close();
        emf.close();
    }
}



