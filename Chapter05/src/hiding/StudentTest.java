package hiding;

// private 변수 테스트하기

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
		// studentLee.studentName = "이은빈";		<= 오류 발생. 변수가 private
		// studentName 변수를 사용할 수 있도록 public 메서드를 제공해야 함
		
		// setStudentName() 메서드를 활용해 private 변수에 접근 가능
		studentLee.setStudentName("이은빈");
		
		// 직접 이름 출력은 불가. getStudentName()을 통해 출력 가능
		System.out.println(studentLee.getStudentName());
	}
}
