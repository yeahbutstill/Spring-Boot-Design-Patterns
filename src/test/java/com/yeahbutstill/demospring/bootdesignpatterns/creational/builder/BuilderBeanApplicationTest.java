package com.yeahbutstill.demospring.bootdesignpatterns.creational.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = BuilderApplication.class)
class BuilderBeanApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testBuilderPrototype() {

        Product product = applicationContext.getBean("productGadget", Product.class);
        product.setId("L001");
        product.setName("Laptop Asus A11 15 inch");
        product.setPrice(15_000_000L);
        product.setSku("ASUS");

        Assertions.assertNotNull(product);
        System.out.println(product);

    }
}