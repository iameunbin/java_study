// �ܶ� ȸ�� �� �ǽ��ϱ�
/* �ܶ� ȸ�� �� : �� �� ����� �� �� ������ �� �� �� ���� ��� �������� �ʴ���
 * ��� ���� �� �� �ִ� ��쿡, ������ ���� ������� �ʴ� ��
 */

package chapter03;

public class OperationEx3 {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1=num1+10)<10) && ((i=i+2)<10);
		System.out.println(value);		// false
		System.out.println(num1);		// 20
		// �� ������ �� ���� �����̸� �� ���� ������� �ʾ� i�� �״��
		System.out.println(i);			// 2
		
		value = ((num1=num1+10)>10)||((i=i+2)<10);
		System.out.println(value);		// true
		System.out.println(num1);		// 30
		// �� �տ��� �� ���� ���̸� �� ���� ������� �ʾ� i�� �״��
		System.out.println(i);			// 2
	}

}
