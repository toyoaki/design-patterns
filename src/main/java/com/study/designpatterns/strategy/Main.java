package com.study.designpatterns.strategy;

/**
 * Strategy Pattern
 * <br><br>
 * - Defines a family of algorithms, encapsulates each one and make them interchangeable
 * - Lets the algorithm vary in runtime, independently from clients that use it
 */
public class Main {
    
    public static void main(String[] args) {
	Order cupOrder = new Order(new CheckPaymentProcessor());
	cupOrder.processPayment();
	
	cupOrder.setPaymentProcessor(new MoneyPaymentProcessor());
	cupOrder.processPayment();
    }
    
}
