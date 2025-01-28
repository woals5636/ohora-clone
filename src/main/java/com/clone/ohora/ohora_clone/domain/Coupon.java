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
@Table(name = "OCOUPON")
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cpnId; // 쿠폰 ID

    private Integer cpnDiscountRate; // 할인율

    @Column(length = 50)
    private String cpnInfo; // 쿠폰 설명

    private LocalDate cpnStartDate; // 쿠폰 시작일

    @Column(length = 1)
    private String cpnApply = "P"; // 적용대상

    private LocalDate cpnEndDate; // 쿠폰 종료일

    private Integer cpnMaxAmount; // 최대 금액

    @Column(length = 30)
    private String cpnConValue; // 조건 값

    @Column(length = 15)
    private String cpnConType; // 조건 유형

    @Column(length = 1)
    private String cpnDiscountType; // 할인 유형
}
