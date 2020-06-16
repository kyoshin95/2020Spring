package com.bjh.first.mission;

public class Misson6_3 
{
	public static void main(String[] args)
	{
		int sum = 0, cnt = 2;
		
		for(int i = 27; i <= 34; i++)
		{
			for(int j = 1; j <= 9; j++)
			{
				sum = cnt * j;
				System.out.printf("%d * %d = %d\n", cnt, j, sum);
			}
			System.out.println("-----------");
			cnt++;
		}
	}
}
