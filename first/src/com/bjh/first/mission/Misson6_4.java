package com.bjh.first.mission;

public class Misson6_4 
{
	public static void main(String[] args)
	{
		int sum = 0;
		
		for(int i = 1; i <= 9; i++)
		{
			for(int j = 2; j <= 9; j++)
			{
				sum = i * j;
				System.out.printf("%d * %d = %d\t", j, i, sum);
			}
			System.out.println();
		}
	}
}
