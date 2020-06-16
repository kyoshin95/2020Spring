package com.bjh.first;

import java.util.Scanner;

public class Operator4 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력할 수는 : ");
		int input_num = sc.nextInt();
		
		if(input_num % 2 == 1)
		{
			System.out.println("홀수입니다.");
		}
		else if(input_num % 2 == 0)
		{
			System.out.println("짝수입니다.");
		}
		else
		{
			System.out.println("입력값이 잘못 되었습니다.");
		}
		
		
	}
}
