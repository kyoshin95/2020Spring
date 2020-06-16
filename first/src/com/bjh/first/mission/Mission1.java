package com.bjh.first.mission;
import java.util.Random;
import java.util.Scanner;

public class Mission1 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		while(true)
		{
			System.out.print("1 ~ 20사이의 값을 입력해주세요 : ");
			
			int input_num = sc.nextInt();
			int random_num = random.nextInt(20);
			
			if(input_num == 99)
			{
				sc.close();
				System.out.print("수고하셨습니다.");
				break;
			}
			
			System.out.println("---------------");		
			System.out.printf("입력 값은 : %d\n", input_num);
			System.out.println("---------------");
			System.out.printf("정답 값은 : %d\n", random_num);
			System.out.println("---------------");
			
			if(input_num == random_num)
				
			{
				System.out.println("결과 : 정답입니다.");
			}
			else
			{
				System.out.println("결과 : 오답입니다.");
			}
			
			System.out.println("---------------");
			System.out.println("*** 그만하시려면 99를 눌러주세요.");
			System.out.println("---------------");
		}
	}
}
