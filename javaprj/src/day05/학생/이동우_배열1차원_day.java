package day05.학생;

import java.util.Scanner;

public class 이동우_배열1차원_day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] month = new int[12];
		
		int [] day = new int[31];
		
		Scanner sc = new Scanner(System.in);
		


		for(int i = 0; i < month.length; i++) {
			month[i] = sc.nextInt();
			
			for(int j = 0; j < day.length; j++) {
				day[j] = sc.nextInt();
				
				System.out.println("당신이 선택한 날짜는 " + month[i] + "월 " + day[j] + "일 입니다.");
			}
		}
	}

}
