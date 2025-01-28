package com.clone.ohora.ohora_clone.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "OPDTDESIGN")
public class ProductDesign {

    @EmbeddedId
    private ProductDesignId id;

    @Embeddable
    @Getter
    @Setter
    @NoArgsConstructor
    public static class ProductDesignId implements Serializable {
        private Long pdtId; // 상품 ID
        private Long designId; // 디자인 ID
    }
}
