package com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = FactoryMethodApplication.class)
class FactoryMethodApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testFactoryMethod() {

        SocialMedia facebook = applicationContext.getBean(SocialMedia.class, SocialMediaType.FACEBOOK);
        SocialMedia twitter = applicationContext.getBean(SocialMedia.class, SocialMediaType.TWITTER);
        SocialMedia instagram = applicationContext.getBean(SocialMedia.class, SocialMediaType.INSTAGRAM);
        SocialMedia tiktok = applicationContext.getBean(SocialMedia.class, SocialMediaType.TIKTOK);
        SocialMedia google = applicationContext.getBean(SocialMedia.class, SocialMediaType.GOOGLE);

        Assertions.assertNotNull(facebook);
        Assertions.assertNotNull(twitter);
        Assertions.assertNotNull(instagram);
        Assertions.assertNotNull(tiktok);
        Assertions.assertNotNull(google);

        System.out.println(facebook);
        System.out.println(twitter);
        System.out.println(instagram);
        System.out.println(tiktok);
        System.out.println(google);

    }
}