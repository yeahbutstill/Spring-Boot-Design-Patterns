package com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts;

import com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts.creditcard.CreditCardCancelPaymentRequest;
import com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts.creditcard.CreditCardChargePaymentRequest;
import com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts.creditcard.CreditCardGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreditCardPaymentFactory implements PaymentFactory {

    @Override
    public ChargePaymentRequest createChargePaymentRequest() {
        return CreditCardChargePaymentRequest.builder()
                .id("CHR01")
                .amount(100_000_000L)
                .build();
    }

    @Override
    public CancelPaymentRequest createCancelPaymentRequest() {
        return CreditCardCancelPaymentRequest.builder()
                .id("CAN01")
                .build();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
//        throw new UnsupportedOperationException("Get Balance is not supported in Credit Card");
        return CreditCardGetBalancePaymentRequest.builder()
                .userId("GB01")
                .build();
    }

}
