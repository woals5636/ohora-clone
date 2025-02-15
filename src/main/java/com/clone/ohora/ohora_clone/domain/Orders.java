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
/* 엔티티명을 Order로 하면 예약어라서 생성이 안됨 */
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ordPk; // 주문 PK

    @Column(length = 30, nullable = false)
    private String ordId; // 주문 ID

    private Long userId; // 회원 ID
    private Long icpnId; // 발급 쿠폰 ID

    @Column(length = 10)
    private String ordName; // 주문자명

    @Column(length = 200)
    private String ordAddress; // 배송 주소

    @Column(length = 5, nullable = false)
    private String ordZipCode; // 우편번호

    @Column(length = 20)
    private String ordTel; // 전화번호

    @Column(length = 100)
    private String ordEmail; // 이메일

    @Column(length = 50)
    private String ordPassword; // 주문 비밀번호

    private LocalDate ordOrderDate; // 주문일

    private Integer ordTotalAmount = 0; // 총 주문 금액

    private Integer ordCpnDiscount = 0; // 쿠폰 할인 금액

    private Integer ordPdtDiscount = 0; // 추가 할인 금액

    private Integer ordUsePoint; // 적립금 사용

    @Column(length = 30)
    private String ordPayOption; // 결제 수단

    private Integer ordDeliveryFee = 3000; // 배송비
}
