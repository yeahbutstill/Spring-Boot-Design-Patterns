package com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod;

import lombok.Builder;
import lombok.Data;

@Deprecated
@Data
// lombok builder bisa ditek ada berapa constructor dan atribute
@Builder // automasikan akan dibuatkan class yang namanya ProductBuilder oleh si lombok
public class FacebookSocialMedia implements SocialMedia {

    private String name;
    private String url;
    private SocialMediaType type;
}
