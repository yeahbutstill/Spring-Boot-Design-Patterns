package com.yeahbutstill.demospring.bootdesignpatterns.creational.factorymethod.abstracts;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = AbstractFactoryApplication.class)
class AbstractFactoryApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    public void charge(PaymentFactory paymentFactory) {
        ChargePaymentRequest chargePaymentRequest = paymentFactory.createChargePaymentRequest();
        chargePaymentRequest.setId("xxx");
        chargePaymentRequest.setAmount(10_000_000L);

        // kirim ke payment gateway
        System.out.println(chargePaymentRequest);
    }

    public void cancel(PaymentFactory paymentFactory) {
        CancelPaymentRequest cancelPaymentRequest = paymentFactory.createCancelPaymentRequest();
        cancelPaymentRequest.setId("xxx");

        // kirim ke payment gateway
        System.out.println(cancelPaymentRequest);
    }

    public Long getBalance(PaymentFactory paymentFactory) {
        GetBalancePaymentRequest getBalancePaymentRequest = paymentFactory.createGetBalanceRequest();
        getBalancePaymentRequest.setUserId("dani");
        return 10_000_000L;
    }

    @Test
    void testAbstractFactory() {

        PaymentFactory creditCardPaymentFactory = applicationContext.getBean(CreditCardPaymentFactory.class);
        PaymentFactory bcaKlikPaymentFactory = applicationContext.getBean(BcaKlikPaymentFactory.class);
        PaymentFactory goPayPaymentFactory = applicationContext.getBean(GoPayPaymentFactory.class);

        charge(bcaKlikPaymentFactory);
        charge(goPayPaymentFactory);
        charge(creditCardPaymentFactory);

        cancel(bcaKlikPaymentFactory);
        cancel(goPayPaymentFactory);
        cancel(creditCardPaymentFactory);

        getBalance(goPayPaymentFactory);
        getBalance(bcaKlikPaymentFactory);
        getBalance(creditCardPaymentFactory);

    }
}