// �л� Ŭ���� �����ϱ�
package cooperation;

public class Student {
	public String studentName;	// �л� �̸�
	public int grade;			// �г�
	public int money;			// �л��� ������ �ִ� ��
	
	// �л� �̸��� ���� ���� �Ű������� �޴� ������
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	// �л��� ������ Ÿ�� 1000���� �����ϴ� ����� ������ �޼���
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	// �л��� ����ö�� Ÿ�� 1500���� �����ϴ� ����� ������ �޼���
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}

	// �л��� ���� ������ ����ϴ� �޼���
	public void showInfo() {
		System.out.println(studentName + "���� ���� ���� " + money + "�Դϴ�.");
	}

}
