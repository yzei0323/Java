package day03.practice;

public class 순한맛4번 {

	public static void main(String[] args) {
		
		//1+3+5.. 의 등차수열에서 그 값이 1000이 초과하게 될 때의 마지막 항과 초과한 값 출력
		
		int n=1;
		int sum=0;
		
		for(n=1; sum<=30; n+=2) {
			sum+=n;
		}
		System.out.println(n-2);
		System.out.println(sum);
	}
	//30으로 확인해보겟음 n-2해야댐  
}
