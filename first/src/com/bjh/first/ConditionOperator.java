package com.bjh.first;

public class ConditionOperator 
{
	public static void main(String[] args)
	{
		int num = 50;
		
		String result = (num % 2 == 1 ? "홀수" : "짝수");
		
		System.out.printf("%d is %s", num, result);
	}
}