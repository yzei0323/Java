package day04.practice;

import java.util.Scanner;

public class 제어구조문제4번 {

	public static void main(String[] args) {
		
		// 1. 고객정보(아이디, 이름, 나이, 키) 출력하기
		
				String id, name;
				int age, height;
				
				Scanner sc = new Scanner(System.in);
				
				System.out.print("아이디를 입력하세요: ");
				id = sc.nextLine();
				
				System.out.print("이름을 입력하세요: ");
				name = sc.nextLine();
				
				System.out.print("나이를 입력하세요: ");
				age = sc.nextInt();
				
				System.out.print("키를 입력하세요(cm): ");
				height = sc.nextInt();
			
				
				System.out.println("고객정보: "+id+", "+name+", "+age+"살, "+height+"cm");


	}

}
