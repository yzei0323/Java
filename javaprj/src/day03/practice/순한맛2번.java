package day03.practice;

public class 순한맛2번 {

	public static void main(String[] args) {
		
		// 1+(1+2)+(1+2+3)+..+(1+2+3+4+..+100)의 합
		
		int n=1;
		int sum=0;
		int result=0;
		
		for(n=1; n<=10; n++) {
			sum+=n;
			result+=sum;
		}
		System.out.println(result);
	}

}

//10까지만 해보는 걸로 확인함
