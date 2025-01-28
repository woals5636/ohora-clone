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
@Table(name = "OFAQ")
public class Faq {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long faqId; // 게시물 ID

    private Long fcatId; // 카테고리 ID

    @Column(nullable = false)
    private Long userId; // 회원 ID

    @Column(nullable = false, length = 50)
    private String faqTitle; // 제목

    @Column(length = 3000)
    private String faqContent; // 내용

    @Column(length = 10)
    private String faqWriter; // 작성자

    private Integer faqViewCount = 0; // 조회수

    private LocalDate faqWriteDate; // 작성일자

    private LocalDate faqModifyDate; // 수정일자
}
