package classpart;			// 패키지는 클래스의 묶음
// 프로젝트 전체 소스 코드를 구성하는 계층 구조가 됨

// 메서드 실습
// 클래스 이름은 대문자로 시작
public class Student {		// class : 클래스를 만드는 예약어, Student : 클래스 이름
	// 멤버 변수 : 클래스 "속성"을 나타냄
	int studentID;			// 학번
	// String 클래스 : 문자열
	String studentName;		// 학생 이름
	int grade;				// 학년
	String address;			// 사는 곳
	
	// 메서드 (멤버 함수) : 멤버 변수를 사용하여 클래스 "기능" 구현
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address); 	// 이름, 주소 출력
	}
	
	// 메서드 : 멤버 변수를 사용하여 클래스의 기능 구현. 함수에 객체 지향 개념이 포함된 용어
	// 학생의 이름을 반환하는 메서드
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	// 클래스 내부에 main 함수.이 클래스가 프로그램의 시작 클래스
	public static void main(String[] args) {
		Student studentAhn = new Student();		// Student 클래스 생성
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
