// serialNum�� get(), set() �޼��� ����ϱ�

package staticex;

public class Student2 {

	private static int serialNum = 1000;	// private ������ ����
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	// serialNum�� get() �޼���
	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	}
	
	// serialNum�� set() �޼���
	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
}
