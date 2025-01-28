package com.clone.ohora.ohora_clone.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "OFAQCATEGORY")
public class FaqCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fcatId; // 카테고리 ID

    @Column(length = 15)
    private String fcatName; // 카테고리명
}
