package com.cool.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(value="product")
@Data
public class Product {
    @Id
    private String id;
    private String name;
    private String skuCode;
    private String description;
    private BigDecimal price;
}
