package com.rpg_games1;
import com.rpg_games1.*;

public class Knight extends Character {
	
	public Knight() {
		super();
		this.weapon = new SwordBehavior();
	}
	public Knight(String name, int age) {
		super(name, age);
		this.weapon = new SwordBehavior();
	}
	
    @Override
    public String toString() {
    	String result = "";
    	
    	result += String.format("My name is %s.\n", this.name);
    	result += String.format("My age is %d.\n", this.age);
    	result += String.format("I am a %s.", "Knight");
    	
    	return result;
    }
	
}
