package day03.practice;

import java.util.Scanner;

public class 매운맛2번 {

	public static void main(String[] args) {
		
		//이름, 구분코드, 작업시간을 입력받아
		// 1: 2000원 , 2: 2500원, 3: 3000원, 4:4000원으로 임금계산해서 출력

		
		String name;
		int code;
		int time;
		int money=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		name = sc.nextLine();
		
		System.out.print("구분코드를 입력하세요: ");
		code = sc.nextInt();
		
		System.out.print("작업시간을 입력하세요: ");
		time = sc.nextInt();
		
		/*
		switch(code) {
		
		case 1:
			money=time*2000;
			break;
		case 2:
			money=time*2500;
			break;
		case 3:
			money=time*3000;
			break;
		case 4:
			money=time*4000;
			break;
		default:
			money=0;
			break;
		}
		*/
		
		if(code==1) {
			money=time*2000;
		}else if(code==2) {
			money=time*2500;
		}else if(code==3) {
			money=time*3000;
		}else if(code==4) {
			money=time*4000;
		}else {
			money=0;
		}
		
		System.out.println(name+", "+money+"원");
	}

}
