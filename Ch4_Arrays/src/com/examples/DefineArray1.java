package com.examples;

public class DefineArray1 {

	public static void main(String[] args) {
		// �w�q scores �}�C�A�ðt�m�O����
		int scores[] = new int[3]; // �}�C���ѦҸ�ƫ��O
		
		scores[0] = 85;
		scores[1] = 99;
		scores[2] = 100;
		
		System.out.println("scores:");

		for(int i=0; i<scores.length; i++) // �� length ���o�}�C size �j�p
		{
			System.out.println(String.format("scores[%d] = %3d", i, scores[i]));
		}
		
		// -------------------------------------------------------------------------
		
		// using for-each
		int i=0;
		for(int val : scores) // for-each �u��Ū�����\��A����Ψӳ]�w��������
		{
			System.out.println(String.format("scores[%d] = %3d", i, val));
			i++;
		}
		
	}

}
