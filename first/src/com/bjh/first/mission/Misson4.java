package com.bjh.first.mission;

import java.util.Scanner;

public class Misson4 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력해주세요 : ");
		
		String input_num = sc.next();
		
		switch(input_num)
		{
			case "1" : case "2" : case "12" : // 겨울 판별
				System.out.println("겨울입니다."); 
				break;
			case "3" : case "4" : case "5" : // 봄 판별
				System.out.println("봄입니다.");  
				break;
			case "6" : case "7" : case "8" : // 여름 판별
				System.out.println("여름입니다."); 
				break;
			case "9" : case "10" : case "11" : // 가을 판별
				System.out.println("가을입니다."); 
				break;
			default : // Default 판별 
				System.out.println("잘 못 입력하셨습니다."); 
				break;
		}
	}
}
