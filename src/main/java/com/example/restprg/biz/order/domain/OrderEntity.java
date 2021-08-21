package com.example.restprg.biz.order.domain;

import com.example.restprg.biz.member.domain.MemberEntity;
import lombok.*;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.domain.Page;

import javax.persistence.*;
import java.sql.Timestamp;

@ToString(exclude = {"member"})
@Data
@Entity
@Table(name = "ORD")
@DynamicInsert
@DynamicUpdate
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity {


    @Id
    @Column(name = "SEQ")
    private Long seq;

    @Column(name = "ORD_NUM")
    private String ordNum;

    @Column(name = "PRD_NAME")
    private String prdName;

    @Column(name = "PAY_DATE")
    private Timestamp payDate; // 결제일자

    @Column(name = "ORD_DATE")
    private Timestamp ordDate; // 주문일자

    @Column(name = "REG_DATE")
    @CreationTimestamp
    private Timestamp regDate; // 생성일자
    @Column(name = "UPT_DATE")
    @UpdateTimestamp
    private Timestamp uptDate; // 수정일자

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( name = "MEM_SEQ" , referencedColumnName = "SEQ" , insertable = true, updatable = true)
    private MemberEntity member;


}
