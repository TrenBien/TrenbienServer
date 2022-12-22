package com.ybigta.trenbien.analysis;

import com.ybigta.trenbien.domain.document.PostDoc;
import com.ybigta.trenbien.domain.entity.Trend;
import com.ybigta.trenbien.service.PostService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class AnalysisTrend {

    public void updateTrend(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("trenbien");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        PostService postservice = new PostService();
//        for (int i = 0; i < 100; i++){
        Trend trend = Trend.builder()
                .name("호이안로스터리 송리단길점")
                .category("카페,디저트")
                .detailedAddress("서울 송파구 백제고분로45길 3-18")
                .district(17)
                .latitude(37.5622319f)
                .longitude(126.9261355f)
                .score(53.515149942287714f)
                .placeUrl("https://m.place.naver.com/restaurant/1403694368/home")
                .imageUrl("https://search.pstatic.net/common/?autoRotate=true&type=w560_sharpen&src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20200928_274%2F1601278120753p7l59_JPEG%2FlLbHmohg5rBKLgCv1mX5jhJZ.jpeg.jpg")
                .priceIsReasonable(0.5f)
                .goodValueForMoney(0.5f)
                .goodForGroupMeeting(0.5f)
                .goodForTalking(0.5f)
                .desertIsGood(0.5f)
                .storeIsSpacious(0.5f)
                .storeIsClean(0.5f)
                .parentsLikeToRest(0.5f)
                .viewIsGood(0.5f)
                .worthAsMuchAsExpensive(0.5f)
                .breadIsDelicious(0.5f)
                .goodForPicture(0.5f)
                .explanationIsDetailed(0.5f)
                .quantityIsGood(0.5f)
                .oneDayClassIsGood(0.5f)
                .drinkIsGood(0.5f)
                .foodIsGood(0.5f)
                .interiorIsGood(0.5f)
                .ingredientIsFresh(0.5f)
                .goodForParking(0.5f)
                .goodForKindness(0.5f)
                .coffeeIsDelicious(0.5f)
                .goodForSpecialDay(0.5f)
                .specialMenuExists(0.5f)
                .goodForEatingAlone(0.5f)
                .toiletIsClean(0.5f)
                .tag1(null)
                .tag2("가성비가 좋아요")
                .build();
        em.persist(trend);
 //       }

        tx.commit();
        em.close();
        emf.close();
    }
}
