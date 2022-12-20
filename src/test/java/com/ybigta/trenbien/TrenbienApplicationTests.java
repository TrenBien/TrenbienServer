package com.ybigta.trenbien;

import com.ybigta.trenbien.analysis.AnalysisTrend;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TrenbienApplicationTests {

	@Test
    void testUpdateTrend(){
        AnalysisTrend test = new AnalysisTrend();
        test.updateTrend();
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("trenbien");
//
//        EntityManager em = emf.createEntityManager();
//
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//
//        Trend trend = Trend.builder()
//                .name("name")
//                .category("커피")
//                .tag("tag")
//                .detailedAddress("서울 동작구 땡땡")
//                .district("서울 동작구")
//                .latitude(2f)
//                .longitude(3f)
//                .score(10)
//                .build();
//
//        em.persist(trend);
//
//        tx.commit();
//        em.close();
//        emf.close();
    }

}
