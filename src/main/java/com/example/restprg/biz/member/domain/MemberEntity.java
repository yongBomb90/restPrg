package com.example.restprg.biz.member.domain;


import com.example.restprg.biz.order.domain.OrderEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;
import org.hibernate.annotations.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * 고객 정보를 담은 Entity
 */
@ToString
@Data
@Entity
@Table(name = "MEMBER")
@DynamicInsert
@DynamicUpdate
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberEntity  {

    @Id
    @Column(name = "SEQ")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer seq;// 사용자 번호
    @Column(name = "MEM_ID" , unique = true)
    private String memId; // 사용자 아이디
    @Column(name = "NAME" )
    private String name; // 사용자 이름
    @Column(name = "NICK_NAME")
    private String nickName; // 사용자 별명
    @Column(name = "PWD")
    private String pwd; // 사용자 비밀번호
    @Column(name = "PHN_NUM")
    private String phnNum; // 사용자 핸드폰번호
    @Column(name = "EMAIL" )
    private String email;  // 사용자 이메일
    @Column(name = "SEX" , columnDefinition = "ENUM('M', 'F', 'X')")
    @Enumerated(EnumType.STRING)
    private SEX sex; // 사용자 성별
    @Column(name = "REG_DATE")
    @CreationTimestamp
    private Timestamp regDate; // 사용자 가입일자
    @Column(name = "UPT_DATE")
    @UpdateTimestamp
    private Timestamp uptDate; // 사용자 정보 수정일자

    @OneToMany(mappedBy = "member", fetch = FetchType.LAZY)
    @OrderBy("ordDate desc")
    private List<OrderEntity> orders;

    public enum SEX {
        M, // 남자
        F, // 여자
        X; // 미입력
    }


}

