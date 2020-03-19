package examples;


/*
 * �ϥβĤG�Ӫ����� forName() ��k�ɡA�]�w initialize �� false�A�ҥH���J���O�ɨä��|���W�����R�A�϶��A�ӷ|�b�ϥ����O�إߪ���ɤ~�h�����R�A�϶��A�ĤG�Ӫ����� forName() ��k�|�ݭn�@�����O���J���]Class loader�^�A�d�Ҥ��ҨϥΪ��O�D����������O���J���A16.1.4 �ٷ|�ԲӤ��� Java �������O���J������C
 * 
 * */

public class ClassForNameDemo3 {

	public static void main(String[] args) {		
		
		try {
			Class<?> someClass = Class.forName("examples.A2",
												false, // ���J���O�ɤ������R�A��k
												Thread.currentThread().getContextClassLoader()); // ���I�|�`�J���Q class loader
			
			
			System.out.println("Declare A2 class");
			A2 obj1 = null;
			
			System.out.println("create obj1");
			obj1 = new A2();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
