// ����ö Ŭ���� �����ϱ�

package cooperation;

public class Subway {

	String lineNumber;		// ����ö �뼱
	int passengerCount;		// �°� ��
	int money;				// ���Ծ�
	
	// ����ö �뼱 ��ȣ�� �Ű������� �޴� ������
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	// �°��� ����ö�� ź ��츦 ������ �޼���
	public void take(int money) {
		this.money += money;	// ���� ����
		passengerCount++;		// �°� �� ����
	}
	
	// ����ö ���� ����ϴ� �޼���
	public void showInfo() {
		System.out.println(lineNumber + "�� �°��� " + passengerCount + "���̰�, "
				+ "������ " + money + "�Դϴ�.");
	}
}
