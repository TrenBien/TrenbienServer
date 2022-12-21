package com.ybigta.trenbien;

import com.ybigta.trenbien.analysis.AnalysisTrend;
import com.ybigta.trenbien.datamigration.MongodbToMysql;
import com.ybigta.trenbien.service.PostService;
import com.ybigta.trenbien.util.Distance;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TrenbienApplicationTests {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private MongodbToMysql mongodbToMysql;


    @Test
    void testUpdateTrend(){
        AnalysisTrend test = new AnalysisTrend();
        test.updateTrend();
    }

    @Test
    void testMongodbTOMysql(){
        mongodbToMysql.insertDataFromMongodbToMysql();
    }

    @Test
    void testGetDistance(){
        Distance distance = new Distance();
        Integer resultDistance = distance.getDistanceFromLatAndLong(37.5311f, 126.971f, 37.5094f, 127.079f);
        log.info(" info log={}", resultDistance);
    }
}
