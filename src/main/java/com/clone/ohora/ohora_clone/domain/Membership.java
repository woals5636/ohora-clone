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
public class Membership {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memId; // 멤버십 ID

    @Column(length = 10)
    private String memName; // 멤버십명

    private Integer memBenefit; // 적립 혜택

    private Integer memGradeTier; // 등급 기준
}
