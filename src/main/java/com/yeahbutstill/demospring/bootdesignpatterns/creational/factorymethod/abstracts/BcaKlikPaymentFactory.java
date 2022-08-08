package com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts;

import com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts.bcaklikpay.BcaKlikPayCancelPaymentRequest;
import com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts.bcaklikpay.BcaKlikPayChargePaymentRequest;
import com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts.bcaklikpay.BcaKlikPayGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BcaKlikPaymentFactory implements PaymentFactory {

    @Override
    public ChargePaymentRequest createChargePaymentRequest() {
        return BcaKlikPayChargePaymentRequest.builder().build();
    }

    @Override
    public CancelPaymentRequest createCancelPaymentRequest() {
        return BcaKlikPayCancelPaymentRequest.builder().build();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return BcaKlikPayGetBalancePaymentRequest.builder().build();
    }

}
