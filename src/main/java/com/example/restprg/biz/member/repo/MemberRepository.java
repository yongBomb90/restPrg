package com.example.restprg.biz.member.repo;

import com.example.restprg.biz.member.domain.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 고객정보에 관한 repository
 */
@RepositoryRestResource
public interface MemberRepository extends PagingAndSortingRepository<MemberEntity, Integer> {

}
