package com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts;

public interface PaymentFactory {

    ChargePaymentRequest createChargePaymentRequest();
    CancelPaymentRequest createCancelPaymentRequest();
    GetBalancePaymentRequest createGetBalanceRequest();

}
