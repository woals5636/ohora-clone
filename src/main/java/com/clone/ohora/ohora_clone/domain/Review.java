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
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long revId; // 리뷰 ID (PK)

    private Long userId; // 회원 ID (FK)
    private Long pdtId; // 상품 ID (FK)

    private Long ordPk; // 주문 ID
    private Long oPdtId; // 주문 상세 ID

    @Column(nullable = false, length = 1500)
    private String revContent; // 리뷰 내용

    @Column(nullable = false)
    private LocalDate revWriteDate; // 리뷰 작성 날짜

    @Column(nullable = false)
    private Integer revRating = 5; // 별점

    private Integer revGoodCount = 0; // 추천 수
    private Integer revBadCount; // 비추천 수
    private Integer revCommentCount = 0; // 댓글 수

    @Column(length = 1)
    private String revIsRecommend = "N"; // 관리자 추천 리뷰

    @Column(length = 1)
    private String revIsPhoto = "N"; // 포토 영상 리뷰

    @Column(length = 20)
    private String revAgeGroup; // 연령대

    @Column(length = 20)
    private String revOption; // 구매 상품 옵션
}
