package com.bjh.first.mission;

public class Mission6_6 
{
	public static void main(String[] args)
	{
		int star = 5;
		
		for(int i = 1; i <= star; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
