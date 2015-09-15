package com.study.designpatterns.strategy;

public class CreditCardPaymentProcessor implements PaymentProcessor {

    public void process() {
	System.out.println("Paying with credit card");
    }

}
