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
@Table(name = "OEVENT")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long evtId; // 이벤트 ID

    @Column(length = 50)
    private String evtTitle; // 이벤트 제목

    @Column(length = 3000)
    private String evtContent; // 이벤트 내용

    @Column(nullable = false)
    private LocalDate evtStartDate; // 이벤트 시작 날짜

    @Column(nullable = false)
    private LocalDate evtEndDate; // 이벤트 종료 날짜

    @Column(length = 50)
    private String evtContentUrl; // 이벤트 내용 URL
}
