package classpart;			// ��Ű���� Ŭ������ ����
// ������Ʈ ��ü �ҽ� �ڵ带 �����ϴ� ���� ������ ��

// �޼��� �ǽ�
// Ŭ���� �̸��� �빮�ڷ� ����
public class Student {		// class : Ŭ������ ����� �����, Student : Ŭ���� �̸�
	// ��� ���� : Ŭ���� "�Ӽ�"�� ��Ÿ��
	int studentID;			// �й�
	// String Ŭ���� : ���ڿ�
	String studentName;		// �л� �̸�
	int grade;				// �г�
	String address;			// ��� ��
	
	// �޼��� (��� �Լ�) : ��� ������ ����Ͽ� Ŭ���� "���" ����
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address); 	// �̸�, �ּ� ���
	}
	
	// �޼��� : ��� ������ ����Ͽ� Ŭ������ ��� ����. �Լ��� ��ü ���� ������ ���Ե� ���
	// �л��� �̸��� ��ȯ�ϴ� �޼���
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	// Ŭ���� ���ο� main �Լ�.�� Ŭ������ ���α׷��� ���� Ŭ����
	public static void main(String[] args) {
		Student studentAhn = new Student();		// Student Ŭ���� ����
		studentAhn.studentName = "�ȿ���";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
