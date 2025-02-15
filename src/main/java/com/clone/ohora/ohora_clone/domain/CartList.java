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
@Table
public class CartList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clistId; // 장바구니 목록 ID

    private Long userId; // 유저 ID
    private Long pdtId; // 상품 ID
    private Long optId; // 옵션 ID

    private Integer clistPdtCount; // 상품 수량

    private LocalDate clistAddDate; // 추가 날짜

    @Column(length = 1, nullable = false)
    private String clistSelect = "Y"; // 선택 여부
}
