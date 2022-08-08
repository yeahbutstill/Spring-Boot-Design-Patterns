package com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class FactoryMethodApplication {

    @Bean
    @Scope("prototype")
    public SocialMedia socialMedia(SocialMediaType socialMediaType) {

        if (socialMediaType == SocialMediaType.FACEBOOK) {
            return FacebookV2SocialMedia.builder()
                    .name("Facebook")
                    .url("https://web.facebook.co.id")
                    .type(SocialMediaType.FACEBOOK)
                    .build();
        } else if (socialMediaType == SocialMediaType.TWITTER) {
            return TwitterSocialMedia.builder()
                    .name("Twitter")
                    .url("https://www.twitter.com")
                    .type(SocialMediaType.TWITTER)
                    .build();
        } else if (socialMediaType == SocialMediaType.TIKTOK) {
            return TiktokSocialMedia.builder()
                    .name("Tiktok")
                    .url("https://www.tiktok.com")
                    .type(SocialMediaType.TIKTOK)
                    .build();
        } else if (socialMediaType == SocialMediaType.INSTAGRAM) {
            return InstagramSocialMedia.builder()
                    .name("Instagram")
                    .url("https://www.instagram.com")
                    .type(SocialMediaType.INSTAGRAM)
                    .build();
        } else if (socialMediaType == SocialMediaType.GOOGLE) {
            return GoogleSocialMedia.builder()
                    .name("Google")
                    .url("https://www.google.com")
                    .type(SocialMediaType.GOOGLE)
                    .build();
        } else {
            throw new IllegalArgumentException("Unsupported Social Media Type");
        }

    }

}
