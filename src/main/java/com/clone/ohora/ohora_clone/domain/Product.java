package com.clone.ohora.ohora_clone.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "OPRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pdtId; // 상품 ID (PK)

    private Long catId; // 카테고리 ID
    private Long scatId; // 하위카테고리 ID

    @Column(nullable = false)
    private Integer pdtNumber = 0; // 옵션 갯수

    @Column(nullable = false, length = 50)
    private String pdtName; // 상품명

    private Integer pdtAmount; // 상품 가격

    @Column(nullable = false)
    private Integer pdtDiscountRate = 0; // 할인율

    @Column(length = 50)
    private String pdtImgUrl; // 이미지 경로

    @Column(nullable = false)
    private Integer pdtCount = 0; // 재고 수량

    @Column(nullable = false)
    private Integer pdtReviewCount = 0; // 리뷰 수

    @Column(nullable = false)
    private Integer pdtSalesCount = 0; // 판매 수량

    @Column(nullable = false)
    private LocalDate pdtAddDate; // 상품 등록일

    @Column(nullable = false)
    private Integer pdtViewCount = 0; // 조회수

    @Column(length = 50)
    private String pdtImgUrl2; // 추가 이미지 경로

    @Column(length = 200)
    private String pdtDescription; // 상품 설명
}
