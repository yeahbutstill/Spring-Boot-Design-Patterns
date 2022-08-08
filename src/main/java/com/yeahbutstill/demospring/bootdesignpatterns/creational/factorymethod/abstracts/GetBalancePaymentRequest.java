package com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts;

public interface GetBalancePaymentRequest {

    String getUserId();
    void setUserId(String userId);
    PaymentMethod getMethod();

}
