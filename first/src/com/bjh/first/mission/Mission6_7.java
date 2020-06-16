package com.bjh.first.mission;

public class Mission6_7 
{
	public static void main(String[] args)
	{
		int star = 7;
		
		for(int i = 1; i <= star; i++)
		{
			// 방법 1
			/*
			for(int j = star-1; j >= i; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++)
			{
				System.out.print("*");
			}
			*/
			
			// 방법 2
			for(int j = star; j >= 1; j--)
			{
				System.out.print(i < j ? " " : "*");
			}
			System.out.println();
		}
	}

}
