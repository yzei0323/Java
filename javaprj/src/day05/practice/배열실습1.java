package day05.practice;

public class 배열실습1 {

	public static void main(String[] args) {
		
		//1. 배열저장출력문제 (값 넣고 출력하기)
		
		//1) 1차원배열 사용하기 - 일주일 점심메뉴 또는 단어
		
		String[] foods = {"햄부기", "피자", "치킨", "떡볶이", "마라탕", "찜닭", "라면"};
		
		System.out.print("[ ");
		for(int i=0; i<foods.length; i++) {
			System.out.print(foods[i]+" ");
		}
		System.out.println("]");
		System.out.println("");
		
		
		//2) 1차원배열 사용하기 - 예상 로또번호 저장하고 출력하기
		
		int[] lotto = {2, 23, 6, 22, 5, 7};
		
		System.out.print("[ ");
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println("]");
		System.out.println("");
		
		
		//3) 1차원배열 사용하기 - 좋아하는 음식 5개 저장하고 출력하기
		String[] foods2 = {"마라탕","엽기떡볶이","초밥","햄부기","훠궈"};
		
		System.out.print("[ ");
		for(int i=0; i<foods2.length; i++) {
			System.out.print(foods2[i]+" ");
		}
		System.out.println("]");
		System.out.println("");
		
		
		//4) 2차원배열 사용하기 - 한달 점심메뉴 또는 단어
		String[][] nct = {
				{"쟈니","태용","유타","쿤","도영"},
				{"텐","재현","윈윈","정우","마크"},
				{"샤오쥔","헨드리","런쥔","제노","해찬"},
				{"재민","양양","천러","지성","시온"},
				{"리쿠","유우시","재희","료","사쿠야"}	
		};
		
		for(int i=0; i<nct.length; i++) {
			System.out.print("[ ");
			for(int j=0; j<nct[i].length; j++) {
				System.out.print(nct[i][j]+" ");
			}
			System.out.println("]");
		}
		System.out.println("");
		
		
		//5) 3차원배열 사용하기
		String[][][] unit = {
				{
					{"쟈니","태용","유타","도영"},
					{"재현","정우","마크","해찬"}
				},
				{
					{"마크","런쥔","제노","해찬"},
					{"재민","천러","지성"}
				},
				{
					{"쿤","텐","윈윈"},
					{"샤오쥔","헨드리","양양"}
				},
				{
					{"시온","리쿠","유우시"},
					{"재희","료","사쿠야"}
				}				
		};
		
		for(int i=0; i<unit.length; i++) {
			System.out.println(i+1+"번 유닛");
			for(int j=0; j<unit[i].length; j++) {
				System.out.print("[ ");
				for(int k=0; k<unit[i][j].length; k++) {
					System.out.print(unit[i][j][k]+" ");
				}
				System.out.println(" ]");
			}
		}
		
	}

}
