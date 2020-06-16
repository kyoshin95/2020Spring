package com.bjh.first.mission;

public class Mission7_1 
{
	public static void main(String[] args)
	{
		int num = 1, count = 1;
		int sum = 0;
		
		while(count <= 100)
		{
			sum = sum + num;
			num++;
			count++;
		}
		System.out.print("1 ~ 100 까지 더한 값은? " + sum);
	}
}
