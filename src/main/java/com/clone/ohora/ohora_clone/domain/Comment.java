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
@Table(name = "OCOMMENT")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cmtId; // 댓글 ID

    private Long revId; // 리뷰 ID
    private Long userId; // 회원 ID

    @Column(nullable = false)
    private LocalDate cmtWriteDate; // 작성 일자

    @Lob
    @Column(nullable = false)
    private String cmtContent; // 댓글 내용
}
