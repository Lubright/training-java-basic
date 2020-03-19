package com.myPakages;

public class TestPackage {
	
	// public: 可以跨套件
	// default: 不可跨套件
	public String toString() {
		String result = "";
		
		result+="TestPackage.toString() is called...";
		
		return result;
	}

}
