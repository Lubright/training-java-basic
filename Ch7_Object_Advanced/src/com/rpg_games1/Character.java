package com.rpg_games1;
import com.rpg_games1.*;

public abstract class Character{

	protected String name;
    protected int age;
    protected WeaponBehavior weapon;

    // constructor
    public Character(){
    	this("test", 1);
    }
    public Character(String name, int age) {
    	this.name = name;
    	this.age = age;
    }

    public void attack(){
        this.weapon.use();
    }
    
    public void setWeaponBehavior(WeaponBehavior w) {
    	this.weapon = w;
    }
    
    @Override
    public String toString() {
    	String result = "";
    	
    	result += String.format("My name is %s.\n", this.name);
    	result += String.format("My age is %d.", this.age);
    	
    	return result;
    }
    
    public void display() {
    	System.out.println(this);
    }






}