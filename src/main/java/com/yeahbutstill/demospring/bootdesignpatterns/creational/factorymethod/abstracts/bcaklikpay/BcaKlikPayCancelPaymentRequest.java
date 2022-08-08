package com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts.bcaklikpay;

import com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts.CancelPaymentRequest;
import com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts.PaymentMethod;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BcaKlikPayCancelPaymentRequest implements CancelPaymentRequest {

    private String id;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.BCA_KLIKPAY;
    }

}
