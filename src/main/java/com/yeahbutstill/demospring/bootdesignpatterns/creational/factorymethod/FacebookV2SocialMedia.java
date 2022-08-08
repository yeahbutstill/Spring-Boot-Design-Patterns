package com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod;

import lombok.Builder;
import lombok.Data;

@Data
// lombok builder bisa ditek ada berapa constructor dan atribute
@Builder // automasikan akan dibuatkan class yang namanya ProductBuilder oleh si lombok
public class FacebookV2SocialMedia implements SocialMedia {

    private String name;
    private String url;
    private SocialMediaType type;

}
