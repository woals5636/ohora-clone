package com.clone.ohora.ohora_clone.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "OORDDETAIL")
@IdClass(OrderDetailId.class)
public class OrderDetail {

    @Id
    private Long opdtId; // 주문상세 ID

    @Id
    private Long ordPk; // 주문 ID

    @Column(length = 50)
    private String opdtName; // 상품명

    @Column(nullable = false)
    private Integer opdtAmount = 0; // 주문상품 가격

    @Column(nullable = false)
    private Integer opdtDcAmount = 0; // 할인상품 가격

    @Column(length = 20)
    private String opdtOpName; // 옵션명

    @Column(nullable = false)
    private Integer opdtOpAmount = 0; // 옵션 가격

    private Integer opdtCount; // 주문 갯수

    @Column(length = 30)
    private String opdtState; // 주문처리상태

    @Column(length = 30)
    private String opdtRefund; // 취소교환반품

    @Column(length = 30)
    private String opdtDelCompany; // 택배사

    @Column(length = 30)
    private String opdtDelNumber; // 송장번호

    @Column(length = 1, nullable = false)
    private String opdtConfirm = "N"; // 구매확정
}

