/*
 * 4�ܰ� : ������ ����ϴ� �ڵ� �����
 * ������ �ּ� �� ���ϱ�
 */
package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		// Ŭ���� �̸����� getInstance() ȣ���Ͽ� ���� ������ ����
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		// �� ������ ���� �ּ����� Ȯ��
		System.out.println(myCompany1 == myCompany2);
	}

}
