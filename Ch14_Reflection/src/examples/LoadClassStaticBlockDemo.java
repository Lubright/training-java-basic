package examples;

/*
 * static block only do once when class is loaded (using new to create instance)
 * non static block do when class is initiated before constructor
 * 
 */

class A{
	static {
		System.out.println("class is loaded..."); // only do once
	}
	{
		System.out.println("����D�R�A�϶�...");
	}
	public A() {
		System.out.println("public A() is called...");
	}
}

public class LoadClassStaticBlockDemo {

	public static void main(String[] args) {
		A obj1 = null;
		System.out.println("Declare A class reference");
		obj1 = new A();
		System.out.println("Create obj1");
		A obj2 = new A();
		System.out.println("Create obj2");
	}

}

/*
Declare A class reference
class is loaded...
����D�R�A�϶�...
public A() is called...
Create obj1
����D�R�A�϶�...
public A() is called...
Create obj2
*/
