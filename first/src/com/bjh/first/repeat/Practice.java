package com.bjh.first.repeat;

import java.util.Random;

public class Practice 
{
	public static void main(String[] args)
	{
		// 랜덤값구하기 1 (0.00 ~ 0.99가 범위 - Exam. Math.random() * 10 == 0 ~ 9의 값이 나온다.) 
		double num = Math.random();
		int rVal = (int)(num * 16);
		System.out.println(rVal);
		
		// 랜던값구하기 2 ( 0 ~ 15 구하기)
		int rVal2 = (int)(Math.random() * 16);
		System.out.println(rVal2);
		
		// 랜덤값구하기 3 ( 1 ~ 15 구하기)
		int rVal3 = (int)((Math.random() * 15) + 1);
		System.out.println(rVal3);
		
		// 랜덤값구하기 4 (30 ~ 50 구하기)
		int rVal4 = (int)((Math.random() * 21) + 30);
		System.out.println(rVal4);
		
		// 랜덤값구하기 5 (46 ~ 77 구하기)
		int rVal5 = (int)((Math.random() * 32) + 46);
		System.out.println(rVal5);

		/* random 21개
		 * 
		 * 0 1 2 3 4 5 6 7 8 9
		 * 10 11 12 13 14 15 16 17 18 19
		 * 20
		 * 
		 */
	}
}

