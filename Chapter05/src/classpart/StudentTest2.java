package classpart;

public class StudentTest2 {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.studentName = "������";
		
		Student student2 = new Student();
		student2.studentName = "������";
		
		// ���� ���� �� ��� (Ŭ���� �̸�@�ν��Ͻ��� �޸� �ּ�)
		System.out.println(student1);
		System.out.println(student2);
	}

}