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
public class Ask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long askId; // 게시물 ID

    private Long userId; // 회원 ID

    @Column(length = 50)
    private String askTitle; // 제목

    @Column(length = 3000)
    private String askContent; // 내용

    @Column(length = 10)
    private String askWriter; // 작성자

    private LocalDate askWriteDate; // 작성일자

    private LocalDate askModifyDate; // 수정일자

    @Column(length = 1, nullable = false)
    private String askIsAnswer = "X"; // 답변 여부
}
