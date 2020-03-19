package examples.Swing;

public class test1 {

	public static void main(String[] args) {
		int fakeConstructorArg = 10;

        Object a = new Object() {
            {
                System.out.println("arg = " + fakeConstructorArg);
            }
        };
	}

}
