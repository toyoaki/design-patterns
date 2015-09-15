package com.study.designpatterns.decorator;

public class Warrior implements Character {

    @Override
    public int atack() {
	return 10;
    }

    @Override
    public String getDescription() {
	return "hand";
    }

}
