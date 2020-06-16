package com.bjh.first.mission;

import java.util.Scanner;

public class Misson3 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성별을 작성해주세요(남/여) : ");
		String sex = sc.next();
		System.out.print("키를 작성해주세요 : ");
		int height = sc.nextInt();
		
		System.out.println("남성 기준 : 160 / 여성 기준 : 150");
		
		if("남".equals(sex) || "여".equals(sex)) 
		{
			int stand_height = 150; // 초기화는 여자 평균 값으로
			
			if("남".equals(sex)) // 남 판별
			{
				stand_height = 160;
			}
			
			if(height > stand_height)
			{
				System.out.println("평균 이상입니다.");
			}
			else if(height < stand_height)
			{
				System.out.println("평균 미만입니다.");
			}
			else
			{
				System.out.println("평균입니다.");
			}
		} 
		else 
		{
			System.out.println("성별을 잘못 입력했습니다.");
		}
	}                                                                                                
}