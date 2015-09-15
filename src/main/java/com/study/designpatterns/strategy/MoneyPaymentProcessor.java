package com.study.designpatterns.strategy;

public class MoneyPaymentProcessor implements PaymentProcessor {

    public void process() {
	System.out.println("Paying with money");
    }

}
