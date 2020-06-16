package com.bjh.first.mission;

import java.util.Scanner;
import java.util.Random;

public class Mission8 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		final int min = 10;
		final int max = 80;
		
		int rand = (int) ((Math.random() * max - min + 1) + min);
		
		while(true)
		{
			System.out.print("값 입력 : ");
			int input_num = sc.nextInt();
			
			if(input_num < min || input_num > max)
			{
				System.out.println("잘못 입력하였습니다.");
				continue;
			}			
			
			if(input_num < rand)
			{
				System.out.println("UP");
			}
			else if(input_num > rand)
			{
				System.out.println("DOWN");
			}
			else 
			{
				sc.close();
				System.out.println("Great!!");
				break;
			}
		}	
	}
}
