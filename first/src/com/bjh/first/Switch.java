package com.bjh.first;

public class Switch 
{
	public static void main(String[] args)
	{
		int num = 3;
		
		switch(num)
		{
			case 1: System.out.println("1"); break;
			
			case 2: System.out.println("2"); break;
				
			case 3: System.out.println("3"); break;
				
			default: System.out.println("원하는 값이 아닙니다."); break;
		}
	}
}
