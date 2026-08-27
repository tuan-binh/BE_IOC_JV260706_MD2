package org.example.demomapstruct.models.dto.req;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProductReq {
    private String name;
    private Double price;
    private Integer stock;
    private Long categoryId;
}
