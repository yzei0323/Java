package day03.practice;

public class 매운맛1번 {

	public static void main(String[] args) {
		
		//1999년 H시 250만명, 연증가율 3.6%
		//		K시 180만명, 연증가율 4.2% 일때, K시의 인구가 H시보다 많아지는 해는?

		int year=1999;
		double H=250;
		double K=180;	//곱하면 실수로 나오기 때문에 double로 해야댐
	
		for(year=1999; H>=K; year++) {
			H*=1.036;
			K*=1.042;
		}
		System.out.println(year);
	}

}
