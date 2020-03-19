package com.examples;

public class ex2_Literal_Pool {

	static void hr(char c, int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.print(c);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		String s1 = "First String"; // �Q�Φr��`�ƫإߦr��
		String s2 = "First String"; // �A�Q�Φr��`�ƫإߦr��
		String s3 = new String("First String"); // new string
		String s4 = new String("First String"); // new string
		
		System.out.println("Judge the following variable reference is equivalent");
		System.out.println("(s1==s2):" + (s1==s2)); // true
		System.out.println("(s1==s3):" + (s1==s3)); // false
		System.out.println("(s3==s4):" + (s3==s4)); // false
		
		hr('-', 50);
		
		// �P�_�r�ꤺ�e�۵�
		System.out.println("Judge the following variable content is equivalent");
		System.out.println("(s1==s2):" + (s1.equals(s2))); // true
		System.out.println("(s1==s3):" + (s1.equals(s2))); // true
		System.out.println("(s3==s4):" + (s3.equals(s4))); // true
		

	}

}
