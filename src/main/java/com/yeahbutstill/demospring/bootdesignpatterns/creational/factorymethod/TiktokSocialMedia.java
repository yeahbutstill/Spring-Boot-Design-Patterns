package com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TiktokSocialMedia implements SocialMedia {

    private String name;
    private String url;
    private SocialMediaType type;

}
