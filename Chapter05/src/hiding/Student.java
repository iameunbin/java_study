package hiding;

// private ����ϱ� (�ܺ� Ŭ�������� ��� �Ұ�)

public class Student {
	int studentID;
	private String studentName;		// private���� ���� ����
	int grade;
	String address;
	
	/*
	 * private ������ studentName�� ������
	 * ���� �������� public get() �޼���
	 * */
	public String getStudentName() {
		return studentName;
	}
	
	/*
	 * private ������ studentName�� ������
	 * ���� �����ϴ� public set() �޼���
	 * */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
