package com.ybigta.trenbien.datamigration;

import com.ybigta.trenbien.domain.document.PostDoc;
import com.ybigta.trenbien.domain.entity.Trend;
import com.ybigta.trenbien.service.PostService;
import com.ybigta.trenbien.valuemapping.DistrictMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

@Service
public class MongodbToMysql {
    @Autowired
    private PostService postService;

    public void insertDataFromMongodbToMysql(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("trenbien");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        List<PostDoc> postCollection = postService.findAllPost();

        for (PostDoc post : postCollection){
            //tag1, tag2선출
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
            String postThereAreManyThingsToDo = post.getThereAreManyThingsToDo();
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
            String postGiveGoodRecommendation = post.getGiveGoodRecommendation();
            String postGoodForKindness = post.getGoodForKindness();
            String postCoffeeIsDelicious = post.getCoffeeIsDelicious();
            String postGoodForSpecialDay = post.getGoodForSpecialDay();
            String postSpecialMenuExists = post.getSpecialMenuExists();
            String postGoodForEatingAlone = post.getGoodForEatingAlone();
            String postToiletIsClean = post.getToiletIsClean();


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
            Float postThereAreManyThingsToDoFloat = Float.parseFloat(postThereAreManyThingsToDo);
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
            Float postGiveGoodRecommendationFloat = Float.parseFloat(postGiveGoodRecommendation);
            Float postGoodForKindnessFloat = Float.parseFloat(postGoodForKindness);
            Float postCoffeeIsDeliciousFloat = Float.parseFloat(postCoffeeIsDelicious);
            Float postGoodForSpecialDayFloat = Float.parseFloat(postGoodForSpecialDay);
            Float postSpecialMenuExistsFloat = Float.parseFloat(postSpecialMenuExists);
            Float postGoodForEatingAloneFloat = Float.parseFloat(postGoodForEatingAlone);
            Float postToiletIsCleanFloat = Float.parseFloat(postToiletIsClean);

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
                    .thereAreManyThingsToDo(postThereAreManyThingsToDoFloat)
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
                    .giveGoodRecommendation(postGiveGoodRecommendationFloat)
                    .goodForKindness(postGoodForKindnessFloat)
                    .coffeeIsDelicious(postCoffeeIsDeliciousFloat)
                    .goodForSpecialDay(postGoodForSpecialDayFloat)
                    .specialMenuExists(postSpecialMenuExistsFloat)
                    .goodForEatingAlone(postGoodForEatingAloneFloat)
                    .toiletIsClean(postToiletIsCleanFloat)
                    .tag1("가격이 합리적이에요")
                    .tag2("가성비가 좋아요")
                    .build();
            em.persist(trend);
        }
        tx.commit();
        em.close();
        emf.close();
    }
}



