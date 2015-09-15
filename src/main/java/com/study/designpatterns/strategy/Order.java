package com.study.designpatterns.strategy;

public class Order {

    private PaymentProcessor paymentProcessor;

    public Order(PaymentProcessor paymentProcessor) {
	super();
	this.paymentProcessor = paymentProcessor;
    }

    public void processPayment() {
	paymentProcessor.process();
    }

    public void setPaymentProcessor(PaymentProcessor paymentProcessor) {
	this.paymentProcessor = paymentProcessor;
    }

}
