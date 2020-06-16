package com.bjh.first.mission;

import java.util.Scanner;

public class Mission7 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		while(true)
		{
			System.out.print("숫자를 입력(종료:0) : "); // 입력문
			
			int input_num = sc.nextInt(); // 입력
			
			sum = sum + input_num; // 입력 합계
								
			if(input_num == 0) // 프로그램 종료 판별
			{
				System.out.println("합계 : " + sum); // 합계 출력
				sc.close(); // 스캐너 닫기
				break; // 종료
			}
		}
	}
}
