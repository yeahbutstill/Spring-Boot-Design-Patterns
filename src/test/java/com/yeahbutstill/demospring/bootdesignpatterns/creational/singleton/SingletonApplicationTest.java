package com.yeahbutstill.demospring.bootdesignpatterns.creational.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = SingletonApplication.class)
class SingletonApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testSingleton() {

        Counter counter1 = applicationContext.getBean(Counter.class);
        Counter counter2 = applicationContext.getBean(Counter.class);
        Counter counter3 = applicationContext.getBean(Counter.class);

        counter1.increment();
        counter2.increment();
        counter3.increment();

        System.out.println(counter1.getValue());
        System.out.println(counter2.getValue());
        System.out.println(counter3.getValue());

    }

    private void incrementCounterAsync(Counter counter, int total) {

        new Thread(() -> {
            for (int i = 0; i < total; i++) {
                counter.increment();
            }
        }).start();

    }

    @Test
    void incrementRaceCondition() {

        // karena singleton dia akan berada di counter yang sama
        // anggap saya ini ada di controller A
        Counter counter1 = applicationContext.getBean(Counter.class);

        // ada lagi yang melakukan di controller B
        Counter counter2 = applicationContext.getBean(Counter.class);

        // ada lagi yang melakukan di controller C
        Counter counter3 = applicationContext.getBean(Counter.class);

        incrementCounterAsync(counter1, 1_000_000);
        incrementCounterAsync(counter2, 1_000_000);
        incrementCounterAsync(counter3, 1_000_000);

        try {
            Thread.sleep(5_000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter1.getValue());
        System.out.println(counter2.getValue());
        System.out.println(counter3.getValue());

    }
}
