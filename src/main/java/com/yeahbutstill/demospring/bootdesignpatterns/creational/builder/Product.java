package com.yeahbutstill.demospring.bootdesignpatterns.creational.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// lombok builder bisa ditek ada berapa constructor dan atribute
@Builder // automasikan akan dibuatkan class yang namanya ProductBuilder oleh si lombok
public class Product {

    private String id;
    private Category category;
    private String name;
    private Long price;
    private String sku;

}
