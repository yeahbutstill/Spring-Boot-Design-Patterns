package com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts;

public interface CancelPaymentRequest {

    String getId();
    void setId(String id);
    PaymentMethod getMethod();

}
