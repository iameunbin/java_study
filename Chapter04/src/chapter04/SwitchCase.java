// switch-case�� ����

package chapter04;

public class SwitchCase {

	public static void main(String[] args) {
		int ranking = 1;	// ����
		char medal_color;	// �޴� ����
		
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
		
		System.out.println(ranking + "�� �޴��� ������ " + medal_color + "�Դϴ�.");
	}

}
