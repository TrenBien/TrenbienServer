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
        List<PostDoc> postCollection = postservice.findAllPost();
        Trend trend = Trend.builder()
                .name("name")
                .category("33")
                .tag("tag")
                .detailedAddress("detailed_address")
                .district("did")
                .latitude(2f)
                .longitude(3f)
                .score(2)
                .placeUrl("testurl")
                .imageUrl("imageurl")
                .build();

        em.persist(trend);

        tx.commit();
        em.close();
        emf.close();
    }
}
