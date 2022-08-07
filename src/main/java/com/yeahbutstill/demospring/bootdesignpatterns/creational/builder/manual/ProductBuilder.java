package com.yeahbutstill.demospring.bootdesignpatterns.creational.builder.manual;

import com.yeahbutstill.demospring.bootdesignpatterns.creational.builder.Category;
import com.yeahbutstill.demospring.bootdesignpatterns.creational.builder.Product;

public class ProductBuilder {

    private String id;

    private Category category;
    private String name;
    private Long price;
    private String sku;

    public ProductBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public ProductBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder setPrice(Long price) {
        this.price = price;
        return this;
    }

    public ProductBuilder setSku(String sku) {
        this.sku = sku;
        return this;
    }

    public ProductBuilder setCategory(Category category) {
        this.category = category;
        return this;
    }

    public Product build() {
        return new Product(id, category, name, price, sku);
    }

}
