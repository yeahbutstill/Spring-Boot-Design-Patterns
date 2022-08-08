package com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.inheritance;

import com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class FactoryInheritanceApplication {

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaFacebook() {
        return FacebookV2SocialMedia.builder()
                .name("Facebook")
                .url("https://web.facebook.co.id")
                .type(SocialMediaType.FACEBOOK)
                .build();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaTwitter() {
        return TwitterSocialMedia.builder()
                .name("Twitter")
                .url("https://web.twitter.co.id")
                .type(SocialMediaType.TWITTER)
                .build();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaInstagram() {
        return InstagramSocialMedia.builder()
                .name("Instagram")
                .url("https://web.instagram.co.id")
                .type(SocialMediaType.INSTAGRAM)
                .build();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaTiktok() {
        return TiktokSocialMedia.builder()
                .name("Tiktok")
                .url("https://web.tiktok.co.id")
                .type(SocialMediaType.TIKTOK)
                .build();
    }

}
