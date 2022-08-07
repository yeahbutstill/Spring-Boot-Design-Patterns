package com.yeahbutstill.demospring.bootdesignpatterns.creational.builder.manual;

import com.yeahbutstill.demospring.bootdesignpatterns.creational.builder.Product;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductBuilderTest {

    @Test
    void testBuilder() {

        Product product = new ProductBuilder()
                .setId("A")
                .setName("Apple Iphone")
                .setPrice(20_000_0000L)
                .setSku("APP")
                .build();

    }
}