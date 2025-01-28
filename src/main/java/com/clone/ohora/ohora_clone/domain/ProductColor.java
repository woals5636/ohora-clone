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
@Table(name = "OPDTCOLOR")
public class ProductColor {

    @EmbeddedId
    private ProductColorId id;

    @Embeddable
    @Getter
    @Setter
    @NoArgsConstructor
    public static class ProductColorId implements Serializable {
        private Long pdtId; // 상품 ID
        private Long colorId; // 컬러 ID
    }
}
