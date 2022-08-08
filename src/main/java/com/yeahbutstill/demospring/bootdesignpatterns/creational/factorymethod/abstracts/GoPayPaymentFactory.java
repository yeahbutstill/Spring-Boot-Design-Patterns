package com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts;

import com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts.gopay.GoPayCancelPaymentRequest;
import com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts.gopay.GoPayChargePaymentRequest;
import com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts.gopay.GoPayGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GoPayPaymentFactory implements PaymentFactory {

    @Override
    public ChargePaymentRequest createChargePaymentRequest() {
        return GoPayChargePaymentRequest.builder().build();
    }

    @Override
    public CancelPaymentRequest createCancelPaymentRequest() {
        return GoPayCancelPaymentRequest.builder().build();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return GoPayGetBalancePaymentRequest.builder().build();
    }

    // No @Builder
//    @Override
//    public ChargePaymentRequest createChargePaymentRequest() {
//        return new GoPayChargePaymentRequest();
//    }
//
//    @Override
//    public CancelPaymentRequest createCancelPaymentRequest() {
//        return new GoPayCancelPaymentRequest();
//    }
//
//    @Override
//    public GetBalancePaymentRequest createGetBalanceRequest() {
//        return new GoPayGetBalancePaymentRequest();
//    }

}
