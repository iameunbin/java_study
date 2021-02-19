package classpart;

// 두 개의 인스턴스(student1, student2) 생성하기

public class StudentTest1 {

	public static void main(String[] args) {
		Student student1 = new Student();		// 첫 번째 학생 생성
		student1.studentName = "이은빈";
		// 도트 연산자 : 멤버 변수와 메서드 참조
		System.out.println(student1.getStudentName());
		
		Student student2 = new Student();		// 두 번째 학생 생성
		student2.studentName = "성지우";
		System.out.println(student2.getStudentName());
	}

}
