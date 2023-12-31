package com.webprogramming.backend.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    private Long id;
    private String productName;
    private String productCode;
    private Integer price;
    private String productCategoryName;
    private String productBrand;
    private String deliveryLocation;
    private String productDescription;
    private String specifications;
}
