// do-while�� ����

package chapter04;

public class DoWhileExample {

	public static void main(String[] args) {
		int num = 1, sum =0;
		
		do {
			sum += num;
			num++;
		} while(num <= 10);
		
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
	}

}