package com.example.restprg.jpa;


import com.example.restprg.biz.member.domain.MemberEntity;
import com.example.restprg.biz.member.repo.MemberRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
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



    /**
     * JPA n+1 문제 해결방안
     * 하나의 트랜재션내에서 한번의 풀링으로 연관되어 있는 데이터를 가졍온다.
     */
    @Test
    @Transactional
    void Lazy() {
        List<MemberEntity> list = memberRepo.findAll();
        MemberEntity member = list.get(0);
        System.out.println(member.getOrders());
    }


}
