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
@Table(name = "OPAYMENT")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long payId; // 결제 ID

    @Column(nullable = false)
    private Long ordPk; // 주문 ID

    private Long userId; // 회원 ID

    private Integer payAmount; // 결제 금액

    private LocalDate payDate; // 결제일

    @Column(length = 30)
    private String payOption; // 결제 수단

    @Column(length = 30)
    private String payState; // 결제 상태

    @Column(length = 30)
    private String payTradeNumber; // 거래 번호
}
