package com.examples;

public enum ex11_ComplexPowerState {
	ON("Power ON"), // like new ex11_ComplexPowerState()
	OFF("Power OFF"),
	SUSPEND("SUSPEND");
	
	
	private String desciption;
	
	// like singleton
	private ex11_ComplexPowerState(String desciption) {
		this.desciption = desciption;
	}
	
	public String getDescription() {
		return desciption;
	}
	
	public void setDescription(String desciption) {
		this.desciption = desciption;
	}
	

}
