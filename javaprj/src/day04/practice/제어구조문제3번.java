package day04.practice;

import java.util.Scanner;

public class 제어구조문제3번 {

	public static void main(String[] args) {

		// 3. 사용자로부터 수를 입력받아 입력받은 수까지의 합 구하기
		
		
		int input;
		int sum=0;
		int n=1;
		
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		
		
		
		//for문
		for(n=1; n<=input; n++) {
			sum+=n;
		}
		System.out.println("입력한 수 "+input+"까지의 합은 "+sum+" 입니다.");
		
		
		
		//while문
		while(n<=input) {
			sum+=n;
			n++;
		}
		System.out.println("입력한 수 "+input+"까지의 합은 "+sum+" 입니다.");
	}

}
