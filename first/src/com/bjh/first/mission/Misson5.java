package com.bjh.first.mission;

import java.util.Scanner;

public class Misson5 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 : ");
		
		int input_num = sc.nextInt();
		int after_num = input_num % 10;
		
		int perfect_score = 100, a_score = 90, b_score = 80, c_score = 70, d_score = 60;
		int subplus_score = 7, subdown_score = 3;
		
		if(input_num < 0 || 100 < input_num)
		{
			System.out.println("0 ~ 100점으로 입력해주세요.");
			return;
		}
		else if(input_num == perfect_score)
		{
			System.out.println("A+");
		}
		else if(input_num >= a_score)
		{
			System.out.print("A");
		}
		else if(input_num >= b_score)
		{
			System.out.print("B");
		}
		else if(input_num >= c_score)
		{
			System.out.print("C");
		}
		else
		{
			System.out.print("D");
		}
			
		if(input_num > d_score || perfect_score < input_num)
		{
			if(after_num >= subplus_score)
			{
				System.out.println("+");
			}
			else if(after_num <= subdown_score && after_num != 0)
			{
				System.out.println("-");
			}

		}
	}
}
