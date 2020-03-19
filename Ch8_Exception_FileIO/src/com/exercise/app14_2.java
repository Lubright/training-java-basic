package com.exercise;

import java.io.*;

// 使用 FileWriter 類別將資料寫入檔案內

public class app14_2 {

	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("./test_output_file1.txt");
			String s1 = "line1\n"
					+ "line2\n"
					+ "line3";
			
			System.out.println("s1 = " + s1);
			
			fw.write(s1);
			fw.flush();
			fw.close();
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
