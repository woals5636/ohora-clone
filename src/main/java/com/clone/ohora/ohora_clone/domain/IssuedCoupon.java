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
public class IssuedCoupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long icpnId; // 발급쿠폰 ID

    private Long userId; // 회원 ID
    private Long cpnId; // 쿠폰 ID

    private LocalDate icpnIssueDate; // 발급일

    @Column(length = 1, nullable = false)
    private String icpnIsUsed = "N"; // 사용 여부
}
