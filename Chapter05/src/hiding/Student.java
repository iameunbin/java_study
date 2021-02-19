package hiding;

// private 사용하기 (외부 클래스에서 사용 불가)

public class Student {
	int studentID;
	private String studentName;		// private으로 변수 선언
	int grade;
	String address;
	
	/*
	 * private 변수인 studentName에 접근해
	 * 값을 가져오는 public get() 메서드
	 * */
	public String getStudentName() {
		return studentName;
	}
	
	/*
	 * private 변수인 studentName에 접근해
	 * 값을 지정하는 public set() 메서드
	 * */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
