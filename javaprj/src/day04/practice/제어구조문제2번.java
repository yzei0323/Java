package day04.practice;

public class 제어구조문제2번 {

	public static void main(String[] args) {
		
		// 2. 1~10까지의 합 구하기(for, while문 사용하기)
		
		int n=1;
		int sum=0;
		
		//for문
		for(n=1; n<=10; n++) {
			sum+=n;
		}
		System.out.println("1부터 10까지의 합: "+sum);
		
		
		//while문
		while(n<=10) {
			sum+=n;
			n++;
		}
		System.out.println("1부터 10까지의 합: "+sum);
	}

}
