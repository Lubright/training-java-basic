package MarchingOntoThePathOfJava.examples.ch25_4;

@FunctionalInterface
interface Shapes{
	public void draw();
}

public class ch25_4 {

	public static void main(String[] args) {
		int r = 5;
		Shapes obj = ()->{
			System.out.println("draw r = " + r + " circle.");
		};

		obj.draw();
	}

}
