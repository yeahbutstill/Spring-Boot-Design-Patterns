package com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts.gopay;

import com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts.ChargePaymentRequest;
import com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts.PaymentMethod;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GoPayChargePaymentRequest implements ChargePaymentRequest {

    private String id;
    private Long amount;

    @Override
    public Long getFee() {
        return 2500L;
    }

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.GOPAY;
    }
}
