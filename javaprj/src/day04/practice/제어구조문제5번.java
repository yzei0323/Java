package day04.practice;

import java.util.Scanner;

public class 제어구조문제5번 {

	public static void main(String[] args) {
		
		// 5. 일정 관리 프로그램 만들기(1번)
		// 1.등록  2.조회  3.변경  4.삭제
		
		
		int input;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("무엇을 하실 건가요? 숫자를 입력하세요.");
		System.out.println("1.등록  2.조회  3.변경  4.삭제");
		
		
		input = sc.nextInt();
		
		if(input==1) {
			System.out.println("등록");
			
		}else if(input==2) {
			System.out.println("조회");
			
		}else if(input==3) {
			System.out.println("변경");
			
		}else if(input==4) {
			System.out.println("삭제");
			
		}else {
			System.out.println("종료");
		}
		

	}

}
