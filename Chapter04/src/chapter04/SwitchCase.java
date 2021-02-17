// switch-case문 예제

package chapter04;

public class SwitchCase {

	public static void main(String[] args) {
		int ranking = 1;	// 순위
		char medal_color;	// 메달 색깔
		
		switch(ranking) {
		case 1 : medal_color = 'G';
				break;
		
		case 2 : medal_color = 'S';
				break;
		
		case 3 : medal_color = 'B';
				break;
		
		default : 
				medal_color = 'A';
		}
		
		System.out.println(ranking + "등 메달의 색깔은 " + medal_color + "입니다.");
	}

}
