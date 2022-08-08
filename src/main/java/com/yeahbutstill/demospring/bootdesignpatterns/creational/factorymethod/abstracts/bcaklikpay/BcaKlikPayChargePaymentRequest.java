package com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts.bcaklikpay;

import com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts.ChargePaymentRequest;
import com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts.PaymentMethod;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BcaKlikPayChargePaymentRequest implements ChargePaymentRequest {

    private String id;
    private Long amount;

    @Override
    public Long getFee() {
        return 5000L;
    }

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.BCA_KLIKPAY;
    }
}
