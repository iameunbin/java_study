package classpart;

// �� ���� �ν��Ͻ�(student1, student2) �����ϱ�

public class StudentTest1 {

	public static void main(String[] args) {
		Student student1 = new Student();		// ù ��° �л� ����
		student1.studentName = "������";
		// ��Ʈ ������ : ��� ������ �޼��� ����
		System.out.println(student1.getStudentName());
		
		Student student2 = new Student();		// �� ��° �л� ����
		student2.studentName = "������";
		System.out.println(student2.getStudentName());
	}

}
