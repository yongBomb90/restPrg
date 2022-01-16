package com.example.restprg.biz.product;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.*;

@Data
@Entity
@DynamicInsert
@DynamicUpdate
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {


    @Id
    @Column(name = "SEQ")
    private Long seq;

    @Column(name = "PRD_NAME")
    private String prdName;

}
