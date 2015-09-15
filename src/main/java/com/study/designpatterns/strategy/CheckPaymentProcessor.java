package com.study.designpatterns.strategy;

public class CheckPaymentProcessor implements PaymentProcessor {

    public void process() {
	System.out.println("Paying with check");
    }

}
