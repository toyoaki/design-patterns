package com.study.designpatterns.decorator;

public abstract class Weapon implements Character {

    protected Character character;

    public Weapon(Character character) {
	super();
	this.character = character;
    }

    public int atack() {
	return character.atack();
    }

    public String getDescription() {
	return character.getDescription();
    }

}
