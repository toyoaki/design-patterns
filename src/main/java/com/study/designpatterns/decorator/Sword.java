package com.study.designpatterns.decorator;

public class Sword extends Weapon {

    public Sword(Character character) {
	super(character);
    }

    @Override
    public int atack() {
	return character.atack() + 5;
    }

    @Override
    public String getDescription() {
	return character.getDescription() + " with sword";
    }

}
