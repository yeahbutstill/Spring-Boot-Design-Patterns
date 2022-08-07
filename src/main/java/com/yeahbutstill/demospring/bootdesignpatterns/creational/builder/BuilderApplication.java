package com.yeahbutstill.demospring.bootdesignpatterns.creational.builder;

import com.yeahbutstill.demospring.bootdesignpatterns.creational.prototype.Employe;
import com.yeahbutstill.demospring.bootdesignpatterns.creational.prototype.Position;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class BuilderApplication {

    @Bean
    @Scope("prototype") // akan selalu dieksekusi ulang atau dibuat ulang
    public Product productGadget() {

        return Product.builder()
                .category(Category.GADGET)
                .build();

    }

    @Bean
    @Scope("prototype") // akan selalu dieksekusi ulang atau dibuat ulang
    public Product productFashion() {

        return Product.builder()
                .category(Category.FASHION)
                .build();

    }

}
