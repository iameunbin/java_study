// ���� Ŭ���� �����ϱ�

package cooperation;

public class Bus {

	int busNumber;		// ���� ��ȣ
	int passengerCount;	// �°� ��
	int money;			// ���� ����
	
	// ���� ��ȣ�� �Ű������� �޴� ������
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	// �°��� ������ ź ��츦 ������ �޼���
	public void take(int money) {
		this.money += money;	// ���� ���� ����
		passengerCount++;		// �°� �� ����
	}
	
	// ���� ������ ����ϴ� �޼���
	public void showInfo() {
		System.out.println("���� " + busNumber + "���� �°��� " + passengerCount + "���̰�, "
				+ "������ " + money + "�Դϴ�.");
	}

}
