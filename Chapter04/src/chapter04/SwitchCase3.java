// switch-case�� �����ϱ�

package chapter04;

public class SwitchCase3 {

	public static void main(String[] args) {
		int floor = 5;		// 5��
		
		switch(floor) {
		case 1:
			System.out.println("1�� �౹�Դϴ�.");
			break;
		case 2:
			System.out.println("2�� �����ܰ��Դϴ�.");
			break;
		case 3:
			System.out.println("3�� �Ǻΰ��Դϴ�.");
			break;
		case 4:
			System.out.println("4�� ġ���Դϴ�.");
			break;
		case 5:
			System.out.println("5�� �ｺ Ŭ���Դϴ�.");
			break;
		default:
			System.out.println("�ǹ��� 1������ 5������ �ֽ��ϴ�.");
		}
	}

}
