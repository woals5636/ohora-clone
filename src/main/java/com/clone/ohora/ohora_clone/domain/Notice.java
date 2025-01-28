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
@Table(name = "ONOTICE")
public class Notice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long noticeId; // 게시물 ID

    @Column(nullable = false)
    private Long userId; // 회원 ID

    @Column(nullable = false, length = 50)
    private String noticeTitle; // 제목

    @Column(length = 3000)
    private String noticeContent; // 내용

    @Column(length = 10)
    private String noticeWriter; // 작성자

    private Integer noticeViewCount = 0; // 조회수

    private LocalDate noticeWriteDate; // 작성일자

    private LocalDate noticeModifyDate; // 수정일자
}
