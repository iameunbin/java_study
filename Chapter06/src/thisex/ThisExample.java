package thisex;

class BirthDay{
	int day;
	int month;
	int year;
	
	// �¾ ������ �����ϴ� �޼���
	public void setYear(int year) {
		this.year = year;			// bDay.year = year; �� ����
	}
	
	// this ��� �޼���
	public void printThis() {
		System.out.println(this);	// System.out.println(bDay); �� ����
	}
}

// main()
public class ThisExample {
	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);			// �¾ ������ 2000���� ����
		System.out.println(bDay);	// ���� ���� ���
		bDay.printThis();			// this ��� �޼��� ȣ��
	}

}
