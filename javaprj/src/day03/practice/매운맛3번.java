package day03.practice;

public class 매운맛3번 {

	public static void main(String[] args) {
		
		//1,1,3,5,8,13...
		//앞의 두 항을 합하면 다음 항이 되는 피보나치 수열
		//50개의 피보나치 수열을 구하라

		int n=0;
		long num1=0;
		long num2=1; //수가 너무 커서 int로는 안됨
		long sum=0;
		
		for(n=0; n<10; n++) {
			sum=num1+num2;
			num1=num2;
			num2=sum;
			System.out.println(num1); 
		}
	}

	//10으로 확인해볼게염 굿굿 맞앗당
}
