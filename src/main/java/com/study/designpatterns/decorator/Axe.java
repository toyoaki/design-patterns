package com.study.designpatterns.decorator;

public class Axe extends Weapon {

    public Axe(Character character) {
	super(character);
    }

    @Override
    public int atack() {
	return character.atack() + 8;
    }

    @Override
    public String getDescription() {
	return character.getDescription() + " with axe";
    }

}
