package MarchingOntoThePathOfJava.examples.ch25_7;

// Lambda body without return

interface myMath{
	public int add(int a, int b);
}

public class ch25_7 {

	public static void main(String[] args) {
		myMath obj = (x, y)->{
			return x + y;
		};
		
		System.out.println(obj.add(1, 2));
	}

}
