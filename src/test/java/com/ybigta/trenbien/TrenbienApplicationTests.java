package com.ybigta.trenbien;

import com.ybigta.trenbien.analysis.AnalysisTrend;
import com.ybigta.trenbien.datamigration.MongodbToMysql;
import com.ybigta.trenbien.service.PostService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TrenbienApplicationTests {

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

}
