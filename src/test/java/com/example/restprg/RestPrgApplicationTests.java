package com.example.restprg;

import com.example.restprg.biz.member.domain.MemberEntity;
import com.example.restprg.biz.member.repo.MemberRepo;
import com.example.restprg.biz.member.repo.MemberRepository;
import com.example.restprg.biz.order.domain.OrderEntity;
import com.example.restprg.biz.order.repo.OrderRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;

@SpringBootTest
class RestPrgApplicationTests {

    @Autowired
    MemberRepository repository;

    @Autowired
    MemberRepo memberRepo;

    @Autowired
    OrderRepo orderRepo;

    @Test
    @Transactional
    @Rollback(false)
    void contextLoads() {
        MemberEntity res = memberRepo.findMemberEntityByEmailALL("1234");
        System.out.println(res.getOrders());

    }

}
