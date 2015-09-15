package com.study.designpatterns.decorator;

/**
 * Decorator Pattern
 * <br><br> 
 * - Attach additional responsibilities to an object dynamically.
 * - Flexible alternative to subclassing for extending functionality.
 * - Example of the open-closed principle
 */

public class Main {

    public static void main(String[] args) {
	Character character = new Warrior();
	System.err.println(character.getDescription() + ": " + character.atack());
	
	character = new Sword(character);
	System.err.println(character.getDescription() + ": " + character.atack());
	
	character = new Axe(character);
	System.err.println(character.getDescription() + ": " + character.atack());
    }

}
