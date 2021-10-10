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
import java.util.List;

/**
jpa 테스트 환경 설정
TODO : 공통 모듈생성
**/
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
    @Rollback(value = false)
    void contextLoads() {

        List<MemberEntity> list2 = memberRepo.findMemberEntityByPrdName("상품");
        list2.get(0).setNickName("닉네임1");
        memberRepo.flush();
        //list2.get(0).setNickName("닉네임2");
        for( int i = 0; i < list2.size(); i++ ) {
            System.out.println("========================================");
            System.out.println(list2.get(i));
            System.out.println("========================================");
        }



    }

    @Test
    @Transactional
    @Rollback(value = false)
    void 조회하는방식GET_VS_FIND() {

        MemberEntity getOne = memberRepo.getById(1);
        MemberEntity gettwo = memberRepo.findById(2).orElse( null ) ;


    }
    
    @Test
    @Transactional
    @Rollback(value = false)
    void 생성() {


    }


}
