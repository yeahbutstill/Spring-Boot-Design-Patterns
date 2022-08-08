package com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts.bcaklikpay;

import com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts.GetBalancePaymentRequest;
import com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts.PaymentMethod;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BcaKlikPayGetBalancePaymentRequest implements GetBalancePaymentRequest {

    private String userId;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.BCA_KLIKPAY;
    }
}
