package com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts.creditcard;

import com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts.CancelPaymentRequest;
import com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts.PaymentMethod;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreditCardCancelPaymentRequest implements CancelPaymentRequest {

    private String id;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.CREDIT_CARD;
    }

}
