/* 
 * static ���� �׽�Ʈ�ϱ�
 * 
 * serialNum�� �������� �� �� �ν��Ͻ����� ������ ���� �����Ǵ� �� Ȯ��
 */
package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("������");
		System.out.println(studentLee.serialNum);	// serialNum ������ �ʱ갪 ���
		studentLee.serialNum++;
		
		Student studentSon = new Student();
		studentSon.setStudentName("�ռ���");
		// ������ �� ���
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
	}
}
