package com.examples;

public class DefineArray3 {

	public static void main(String[] args) {
		// 參考型別，JVM自動初始化
		int scores[] = new int[3];
		int i=0;
		
		for(i=0; i<scores.length; i++)
		{
			System.out.println(String.format("scores[%d] = %3d", i, scores[i]));
		}
		

	}

}
