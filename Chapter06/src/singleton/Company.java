/*
 * �̱��� �������� ȸ�� Ŭ���� �����ϱ�
 * 
 * 1�ܰ� : private ������ �����
 * 2�ܰ� : Ŭ���� ���ο� static���� ������ �ν��Ͻ� �����ϱ�
 * 3�ܰ� : �ܺο��� ������ �� �ִ� public �޼��� �����
 */

package singleton;

public class Company {

	private static Company instance = new Company();	// �����ϰ� ������ �ν��Ͻ�
	private Company() {}
	
	// �ν��Ͻ��� �ܺο��� ������ �� �ֵ��� public get() �޼��� ����
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;	// �����ϰ� ������ �ν��Ͻ� ��ȯ
	}
}
