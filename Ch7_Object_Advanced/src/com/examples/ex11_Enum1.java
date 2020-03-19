package com.examples;

enum PowerState{
	ON, OFF, SUSPEND
}

class Machine{
	private PowerState powerState;
	
	public void setState(PowerState powerState) {
		this.powerState = powerState;
	}
	public PowerState getState() {
		return powerState;
	}
	
}

public class ex11_Enum1 {
	
	static void hr(char c, int n)
	{
	    for(int i=0; i<n; i++)
	    {
	        System.out.print(c);
	    }
	    System.out.println();
	}

	public static void main(String[] args) {
		Machine machine = new Machine();
		
		machine.setState(PowerState.ON);
		
		System.out.println("getClass: " + machine.getClass());
		System.out.println("getState: " + machine.getState());
		
		PowerState tempState = machine.getState();
		System.out.println("tempState: " + tempState);
		System.out.println("tempState.ordinal(): " + tempState.ordinal());
		hr('-', 50);
		
		machine.setState(PowerState.OFF);
		switch(machine.getState()) {
		case ON:
			System.out.println("It's ON");
			break;
		case OFF:
			System.out.println("It's OFF");
			break;
		case SUSPEND:
			System.out.println("It's SUSPEND");
			break;
		default:
			break;
		}
		
		
	}

}
