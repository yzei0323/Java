package day03.practice;

import java.util.Scanner;

public class 순한맛3번 {

	public static void main(String[] args) {
		
		//100개의 수가 입력될 때 양수,음수의 개수를 구하고 양수 중 홀수,짝수의 개수도 구해라
		
		int input;
		int n=1;
		int pos_cnt=0; //양수
		int neg_cnt=0; //음수
		int even_cnt=0; //짝수
		int odd_cnt=0; //홀수
		
		Scanner sc = new Scanner(System.in);
		
		while(n<=10) {
			
			input = sc.nextInt();
			//근데 10번 반복을 어케해 수를 어케 10개 입력해 어 while문 이용해서 ㅇㅇ
			if(input>0) {
				pos_cnt++;
				if(input%2==0) {
					even_cnt++;
				}else {
					odd_cnt++;
				}
			}else {
				neg_cnt++;
			}
			n++;
		}
		System.out.println("양수:"+pos_cnt);
		System.out.println("음수:"+neg_cnt);
		System.out.println("짝수:"+even_cnt);
		System.out.println("홀수:"+odd_cnt);
	}

}
