package com.yeahbutstill.demospring.bootdesignpatterns.creational.prototype;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employe {

    private String id;
    private String name;
    private Position position;
    private Long salary;

}
