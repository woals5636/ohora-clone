package com.clone.ohora.ohora_clone.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table
public class ProductLineUp {

    @EmbeddedId
    private ProductLineUpId id;

    @Embeddable
    @Getter
    @Setter
    @NoArgsConstructor
    public static class ProductLineUpId implements Serializable {
        private Long pdtId; // 상품 ID
        private Long lineUpId; // 라인업 ID
    }
}