package com.yeahbutstill.demospring.bootdesignpatterns.creational.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BuilderApplicationTest {

    @Test
    void testPrototype() {

        Product iphone = Product.builder()
                .id("XXX")
                .category(Category.GADGET)
                .name("Iphone XXX")
                .price(25_000_000L)
                .sku("Apple")
                .build();

        Assertions.assertNotNull(iphone);
        System.out.println(iphone);

    }

}
