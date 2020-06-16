package com.bjh.first.mission;

import java.util.Scanner;

public class misson2 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); // 스캐너 선언
		
		System.out.print("입력할 수는 : ");
		
		int input_num = sc.nextInt(); // 입력
		sc.close(); // 스캐너 닫기
		
		if(input_num % 2 == 1) // 홀수 판별 
		{
			System.out.println("홀수입니다.");
		}
		else if(input_num % 2 == 0) // 짝수 판별
		{
			System.out.println("짝수입니다.");
		}
		else // 예외 값 처리
		{
			System.out.println("입력값이 잘못 되었습니다.");
		}
	}
}
