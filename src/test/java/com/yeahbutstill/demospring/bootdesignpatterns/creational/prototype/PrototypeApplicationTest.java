package com.yeahbutstill.demospring.bootdesignpatterns.creational.prototype;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = PrototypeApplication.class)
public class PrototypeApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testPrototype() {

        Employe dani = applicationContext.getBean("employeManager", Employe.class);
        dani.setName("Dani");

        Employe yuda = applicationContext.getBean("employeStaff", Employe.class);
        yuda.setName("Yuda");

        Employe rendra = applicationContext.getBean("employeCLevel", Employe.class);
        rendra.setName("Rendra");

        Employe raja = applicationContext.getBean("employeVicePresident", Employe.class);
        raja.setName("Raja");

        System.out.println(dani);
        System.out.println(yuda);
        System.out.println(rendra);
        System.out.println(raja);

    }
}
