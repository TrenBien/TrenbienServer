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
        //List<PostDoc> postCollection = postservice.findAllPost();
        for (int i = 0; i < 100; i++){
            Trend trend = Trend.builder()
                    .name("호이안로스터리 송리단길점")
                    .category("카페,디저트")
                    .tag("가격이 합리적이에요, 가성비가 좋아요")
                    .detailedAddress("서울 송파구 백제고분로45길 3-18")
                    .district("서울특별시 송파구")
                    .latitude(2f)
                    .longitude(3f)
                    .score(2)
                    .placeUrl("https://m.place.naver.com/restaurant/1403694368/home")
                    .imageUrl("https://search.pstatic.net/common/?autoRotate=true&type=w560_sharpen&src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20200928_274%2F1601278120753p7l59_JPEG%2FlLbHmohg5rBKLgCv1mX5jhJZ.jpeg.jpg")
                    .build();
            em.persist(trend);
        }

        tx.commit();
        em.close();
        emf.close();
    }
}
