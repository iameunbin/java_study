package hiding;

// private ���� �׽�Ʈ�ϱ�

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
		// studentLee.studentName = "������";		<= ���� �߻�. ������ private
		// studentName ������ ����� �� �ֵ��� public �޼��带 �����ؾ� ��
		
		// setStudentName() �޼��带 Ȱ���� private ������ ���� ����
		studentLee.setStudentName("������");
		
		// ���� �̸� ����� �Ұ�. getStudentName()�� ���� ��� ����
		System.out.println(studentLee.getStudentName());
	}
}
