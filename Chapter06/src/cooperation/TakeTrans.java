// ������ ����ö Ÿ��

package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		// �л� �� �� ����
		Student James = new Student("James", 5000);
		Student Tomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);		// �뼱 ��ȣ�� 100���� ���� ����
		James.takeBus(bus100); 			// james�� 100�� ������ Ž
		James.showInfo();				// james ���� ���
		bus100.showInfo();				// ���� ���� ���
		
		Subway subwayGreen = new Subway("2ȣ��");		// �뼱 ��ȣ�� 2ȣ���� ����ö ����
		Tomas.takeSubway(subwayGreen);				// Tomas�� 2ȣ���� Ž
		Tomas.showInfo(); 							// Tomas ���� ���
		subwayGreen.showInfo();						// ����ö ���� ���
	}

}
