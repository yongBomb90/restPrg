package com.bomb.smpl.jpa;

import com.bomb.smpl.biz.main.entity.TestTbl;
import com.bomb.smpl.biz.main.repo.TestTblRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
class JPA_1 {

    @Autowired
    TestTblRepo testTblRepo;

    @Test
    void save() {
        TestTbl testTbl = TestTbl.builder().seq(1L).memo("Test1").build();
        TestTbl restestTbl = testTblRepo.save(testTbl);
        System.out.printf("================================");
        System.out.printf(restestTbl.toString());
        System.out.printf("================================");
    }
}
