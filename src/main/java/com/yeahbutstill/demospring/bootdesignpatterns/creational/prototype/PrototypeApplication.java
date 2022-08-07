package com.yeahbutstill.demospring.bootdesignpatterns.creational.prototype;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class PrototypeApplication {

    @Bean
    @Scope("prototype") // akan selalu dieksekusi ulang atau dibuat ulang
    public Employe employeManager() {

        Employe employe = new Employe();
        employe.setId("1");
        employe.setPosition(Position.MANAGER);
        employe.setSalary(20_000_000L);
        return employe;

    }

    @Bean
    @Scope("prototype")
    public Employe employeStaff() {

        Employe employe = new Employe();
        employe.setId("2");
        employe.setPosition(Position.STAFF);
        employe.setSalary(10_000_000L);
        return employe;

    }

    @Bean
    @Scope("prototype")
    public Employe employeVicePresident() {

        Employe employe = new Employe();
        employe.setId("3");
        employe.setPosition(Position.VICE_PRESIDENT);
        employe.setSalary(30_000_000L);
        return employe;

    }

    @Bean
    @Scope("prototype")
    public Employe employeCLevel() {

        Employe employe = new Employe();
        employe.setId("4");
        employe.setPosition(Position.C_LEVEL);
        employe.setSalary(40_000_000L);
        return employe;

    }

}
