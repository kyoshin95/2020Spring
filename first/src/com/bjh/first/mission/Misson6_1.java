package com.bjh.first.mission;

public class Misson6_1 
{
	public static void main(String[] args)
	{
		int gugudan = 4, sum = 0, cnt = 1;
		
		for(int i = 9; i < 18; i++)
		{
			sum = gugudan * cnt;
			
			System.out.printf("%d * %d = %d\n", gugudan, cnt, sum);
			
			cnt++;
		}
	}
}
