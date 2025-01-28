package com.clone.ohora.ohora_clone.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "OADDRESS")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addrId; // 배송지 ID

    private Long userId; // 회원 ID

    @Column(nullable = false, length = 20)
    private String addrNick; // 배송지명

    @Column(nullable = false, length = 10)
    private String addrName; // 수령인

    @Column(length = 20)
    private String addrHTel; // 일반 전화

    @Column(nullable = false, length = 20)
    private String addrTel; // 휴대전화

    @Column(nullable = false, length = 100)
    private String addrAddressMain; // 기본 주소

    @Column(length = 100)
    private String addrAddressDetail; // 나머지 주소

    @Column(nullable = false, length = 5)
    private String addrZipCode; // 우편번호

    @Column(length = 1, nullable = false)
    private String addrMain = "N"; // 대표 배송지 여부
}
