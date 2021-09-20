package com.example.restprg.jpa;


import com.example.restprg.biz.member.domain.MemberEntity;
import com.example.restprg.biz.member.repo.MemberRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * JPA Sample Test 클래스
 */
@SpringBootTest
public class JPAsmplTest {

    @Autowired
    MemberRepo memberRepo;

    @Test
    void TestConfigInit() {
        List<MemberEntity> list = memberRepo.findAll();
        System.out.println(list);
    }


}
