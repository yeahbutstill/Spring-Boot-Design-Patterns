package com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.inheritance;

import com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.SocialMedia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = FactoryInheritanceApplication.class)
class FactoryInheritanceApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testFactoryInheritanceMethod() {

        SocialMedia facebook = applicationContext.getBean("socialMediaFacebook", SocialMedia.class);
        SocialMedia twitter = applicationContext.getBean("socialMediaTwitter", SocialMedia.class);
        SocialMedia instagram = applicationContext.getBean("socialMediaInstagram", SocialMedia.class);
        SocialMedia tiktok = applicationContext.getBean("socialMediaTiktok", SocialMedia.class);

        Assertions.assertNotNull(facebook);
        Assertions.assertNotNull(instagram);
        Assertions.assertNotNull(twitter);
        Assertions.assertNotNull(tiktok);
        System.out.println(facebook);
        System.out.println(instagram);
        System.out.println(tiktok);
        System.out.println(twitter);

    }
}