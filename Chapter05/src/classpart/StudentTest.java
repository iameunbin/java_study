package classpart;

// Student Ŭ������ ���� package�� �ֱ� ������ ����
// Ŭ���� �̸��� ���Ƶ� ��Ű���� �ٸ��� �ٸ� Ŭ�����̴�.

public class StudentTest {

	public static void main(String[] args) {
		// new ����� : Ŭ������ ����ϱ� ���� ���� Ŭ������ ����
		// studentAhn : �ν��Ͻ�
		Student studentAhn = new Student();
		studentAhn.studentName = "������";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}

}
