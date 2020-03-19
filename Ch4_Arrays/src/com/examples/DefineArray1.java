package com.examples;

public class DefineArray1 {

	public static void main(String[] args) {
		// 定義 scores 陣列，並配置記憶體
		int scores[] = new int[3]; // 陣列為參考資料型別
		
		scores[0] = 85;
		scores[1] = 99;
		scores[2] = 100;
		
		System.out.println("scores:");

		for(int i=0; i<scores.length; i++) // 用 length 取得陣列 size 大小
		{
			System.out.println(String.format("scores[%d] = %3d", i, scores[i]));
		}
		
		// -------------------------------------------------------------------------
		
		// using for-each
		int i=0;
		for(int val : scores) // for-each 只有讀取的功能，不能用來設定元素的值
		{
			System.out.println(String.format("scores[%d] = %3d", i, val));
			i++;
		}
		
	}

}
