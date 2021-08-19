package com.example.restprg.biz.member.repo;

import com.example.restprg.biz.member.domain.MemberEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

import javax.persistence.NamedAttributeNode;
import java.util.List;
import java.util.Optional;

/**
 * 고객정보에 관한 repository
 */
public interface MemberRepo extends JpaRepository<MemberEntity, Integer> {


    MemberEntity findMemberEntityByEmail(String email);

    @Query(
            "select distinct m  from MemberEntity m left join fetch m.orders   where m.email = :email "
    )
    List<MemberEntity> findMemberEntityByEmailALL(String email);

    @Query(
            "select distinct m  from MemberEntity m left join m.orders o  where o.prdName like concat( '%',:prdName, '%')  "
    )
    List<MemberEntity> findMemberEntityByPrdName(String prdName);

    @Override
    @EntityGraph(attributePaths = { "orders"})
    Optional<MemberEntity> findById(Integer integer);



}
