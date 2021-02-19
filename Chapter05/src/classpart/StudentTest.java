package classpart;

// Student 클래스와 같은 package에 있기 때문에 가능
// 클래스 이름이 같아도 패키지가 다르면 다른 클래스이다.

public class StudentTest {

	public static void main(String[] args) {
		// new 예약어 : 클래스를 사용하기 위해 먼저 클래스를 생성
		// studentAhn : 인스턴스
		Student studentAhn = new Student();
		studentAhn.studentName = "이은빈";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}

}
