package com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts.creditcard;

import com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts.GetBalancePaymentRequest;
import com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts.PaymentMethod;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreditCardGetBalancePaymentRequest implements GetBalancePaymentRequest {

    private String userId;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.CREDIT_CARD;
    }
}
