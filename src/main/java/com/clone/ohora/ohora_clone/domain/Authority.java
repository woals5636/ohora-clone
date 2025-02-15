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
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // PK를 위해 추가 (MySQL에서 적합)

    @Column(nullable = false)
    private Long userId; // 외래 키

    @Column(nullable = false, length = 50)
    private String authority; // 권한
}
