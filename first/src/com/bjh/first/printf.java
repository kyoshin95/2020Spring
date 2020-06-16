package com.bjh.first;

public class printf 
{
	public static void main(String[] args)
	{
		int age = 26;
		String name = "방지환";
		float vision = 1.2f;
		char bloodType = 'A';
		
		
		System.out.printf("나의 이름은 %s 입니다. 나의 나이는 %d입니다. 나의 시력은 %.1f입니다. 나의 혈액형은 %c입니다.", name, age, vision, bloodType);
		
	}

}
