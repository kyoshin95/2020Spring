package com.bjh.first.mission;

public class Mission6_5 
{
	public static void main(String[] args)
	{
		int star = 5;
		
		for(int i = 0; i < (star * star); i++)
		{
			System.out.print("*");
		
			if((i + 1) % star == 0)
			{
				System.out.println();
			}
		}
	}
}
