package com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts.creditcard;

import com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts.ChargePaymentRequest;
import com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts.PaymentMethod;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreditCardChargePaymentRequest implements ChargePaymentRequest {

    private String id;
    private Long amount;

    @Override
    public Long getFee() {
        return getAmount() * 5 / 100; // dikali 5%
    }

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.CREDIT_CARD;
    }
}
