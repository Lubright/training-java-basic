package MarchingOntoThePathOfJava.examples.ch25_5;

// Lambda �ǻ��Ѽ�

@FunctionalInterface
interface Hi{
	public void talking(String name);
}

public class ch25_5 {

	public static void main(String[] args) {
		Hi obj = (name)->{
			System.out.println("Hi " + name + "!");
		};

		obj.talking("Jessica");
	}

}
