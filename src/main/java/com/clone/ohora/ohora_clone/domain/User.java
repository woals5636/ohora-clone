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
@Table(name = "OUSER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // MySQL에 적합한 PK 설정
    private Long userId; // 회원 ID (PK)

    @Column(nullable = false)
    private Long memId = 1L; // 멤버십 ID (기본값 1)

    @Column(nullable = false, length = 20)
    private String username; // 아이디

    @Column(nullable = false, length = 100)
    private String password; // 비밀번호

    @Column(nullable = false, length = 10)
    private String name; // 이름

    @Column(nullable = false, length = 100)
    private String userEmail; // 이메일

    @Column(nullable = false, length = 20)
    private String userTel; // 휴대폰

    @Column(nullable = false)
    private LocalDate userBirth; // 생년월일

    @Column(nullable = false)
    private Integer userPoint = 0; // 적립금

    @Column(nullable = false, length = 1)
    private String userSnsAgree = "N"; // SNS 수신 동의

    @Column(nullable = false)
    private LocalDate userJoinDate = LocalDate.now(); // 가입일 (기본값 현재 날짜)

    @Column(nullable = false)
    private Integer enabled = 1; // 계정 활성화 여부 (기본값 1)
}
