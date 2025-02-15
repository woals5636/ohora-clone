package com.clone.ohora.ohora_clone.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table
public class ProductOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long optId; // 옵션 ID

    private Long pdtId; // 상품 ID

    @Column(nullable = false, length = 20)
    private String optName; // 옵션명

    @Column(nullable = false)
    private Integer optAmount = 0; // 옵션 가격

    @Column(nullable = false)
    private Integer optCount = 0; // 재고수량
}
