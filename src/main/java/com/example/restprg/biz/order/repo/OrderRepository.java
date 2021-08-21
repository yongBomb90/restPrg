package com.example.restprg.biz.order.repo;

import com.example.restprg.biz.member.domain.MemberEntity;
import com.example.restprg.biz.order.domain.OrderEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 고객정보에 관한 repository
 */
@RepositoryRestResource
public interface OrderRepository extends PagingAndSortingRepository<OrderEntity, Long> {

}
