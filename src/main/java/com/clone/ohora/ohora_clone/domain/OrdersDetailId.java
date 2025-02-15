package com.clone.ohora.ohora_clone.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class OrdersDetailId implements Serializable {
    private Long opdtId;
    private Long ordPk;
}
